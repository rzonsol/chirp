<template>
<div>
  <!-- Fixed navbar -->
  <nav class="navbar navbar-default navbar-fixed-top">
    <div class="container-fluid">
      <div class="navbar-header">
        <router-link to="/" class="navbar-brand">CHIRP</router-link>
      </div>
      <div class="navbar-collapse collapse" id="main">
        <ul class="nav navbar-nav">
          <li>
            <router-link to="/">HOME</router-link>
          </li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
          <li>
            <router-link to="/singup" class="nav-item nav-link">Sing Up</router-link>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  <img id="banner" src="../assets/banner.png" class="img-responsive" alt="Responsive image">
</div>
</template>

<script>
  export default {
  }
</script>

<style type="text/css">
  #banner{
    margin-top:70px;
  }
</style>
