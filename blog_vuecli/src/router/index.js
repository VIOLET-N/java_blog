import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Index from '../components/Index.vue'
import Details from '../views/article/Details.vue' 
import Language from '../views/article/Language.vue'
import CreateGroup from '../views/article/CreateGroup.vue'
import Writing from '../views/article/Writing.vue'
import ProjectList from '../views/article/ProjectList.vue'
import Search from '../views/Search.vue'
import GetUserInfo from '../views/login/GetUserInfo.vue'
import Login from '../views/login/LoginIndex.vue'
import Register from '../views/login/Register.vue'
import UserInfo from '../views/login/UserInfo.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home,
    children: [
      {
        path: '/',
		  	name: 'Index',
		  	component: Index,
      },
      {
        path: '/details',
        name: 'Details',
        component: Details
      },
      {
        path: '/language',
        name: 'Language',
        component: Language
      },
      {
        path: '/add-project',
        name: 'CreateGroup',
        component: CreateGroup
      },
      {
        path: '/writing',
        name: 'Writing',
        component: Writing
      },
      {
        path: '/project-list',
        name: 'ProjectList',
        component: ProjectList
      },
      {
        path: '/search',
        name: 'Search',
        component: Search
      },
      {
        path: '/user-info',
        name: "UserInfo",
        component: UserInfo
      }
    ]
  },
  {
    path: '/get-user',
    name: 'GetUserInfo',
    component: GetUserInfo
  },
  {
    path: '/login',
    name: 'LoginIndex',
    component: Login
  },
  {
    path: '/register',
    name: 'Register',
    component: Register
  }
]

const router = new VueRouter({
  mode: 'history',
  routes: routes
})

export default router
