<template>
  <div>
    <h1>Redirect Page</h1>
  </div>
</template>

<script type="text/javascript">
  export default {
    name: 'google-sso',
    data() {
      return {
        message : '',
        username : '',
        access_token : '',
        email : ''
      }
    },
    created : function () {
      this.googleUrl();
    },
    methods : {
      googleUrl () {
        let hashString = this.$route.hash;
        this.access_token = hashString.substring(14).split('&')[0];
        console.log(this.access_token);
        this.fetchEmail();
      },

      fetchEmail () {
        let url = 'https://www.googleapis.com/plus/v1/people/me'
        this.$http.get(url, { headers : {'Authorization' : 'Bearer ' + this.access_token }}).then((res) => {
          console.log(res);
          this.email = res.body.emails[0].value;
          console.log(this.email);
          this.sendTokenAndEmail();
        }, (err) => {
          console.log(err);
        });
      },

      sendTokenAndEmail() {
        let url = "http://localhost:8081/tokenValidation?token=" + this.access_token + "&email=" + this.email;
        this.$http.get(url, {credentials: true}).then((res) => {
          console.log(res);
          this.username = res.body.username;
          if (this.username == null || this.username == '') {
            location.assign("http://localhost:8080/singup");
          } else {
            this.retrieveUser();
          }
        }, (err) => {
          console.log(err);
        })
      },

      retrieveUser () {
        let url = "http://localhost:8081/user/search/findByEmail?email=" + this.email;
        // let url = "http://localhost:8081/user/";
        this.$http.get(url, {credentials: true}).then((res) => {
          console.log(res);
          this.username = res.body.username;
          localStorage.setItem('username', this.username);
          localStorage.setItem('loggedIn', 'true');
          location.assign('http://localhost:8080/');
        }, (err) => {
          console.log(err);
        });
      }
    }
  }
</script>
