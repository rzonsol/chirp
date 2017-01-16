import Vue from 'vue'
import Router from 'vue-router'


Vue.use(Router)

// ===================== Pages Components ======================
import Navbar from './components/Navbar.vue'
import MainPanel from  './components/Main-panel'
import Singup from './components/Singup'
import GoogleSso from './components/Google-sso'
// ==================== Router registration ====================
export default new Router({
  mode: 'history',
  routes: [
    { path: '/', component: MainPanel },
    { path: '/singup', component: Singup},
    { path: '/token', component: GoogleSso}
  ]
})
