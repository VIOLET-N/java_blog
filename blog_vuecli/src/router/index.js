import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Index from '../components/Index.vue'
import Details from '../views/article/Details.vue' 

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home,
    children: [
      {
        path: '/a',
		  	name: 'Index',
		  	component: Index,
      },
      {
        path: '/',
        name: 'Details',
        component: Details
      }
    ]
  },
]

const router = new VueRouter({
  routes
})

export default router
