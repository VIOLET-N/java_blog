import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import axios from 'axios'
import qs from 'qs'
import 'font-awesome/css/font-awesome.min.css' 

Vue.prototype.$axios = axios
Vue.prototype.$qs = qs

axios.defaults.withCredentials = true
axios.defaults.baseURL = "http://localhost:8080" // 默认 URL

Vue.config.productionTip = false

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
