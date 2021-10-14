<template>
  <div class="home">
    <div class="body">
        <div class="b-center">
          <div class="b-left">
            <span class="title">Violet的博客</span>
          </div>
          <ul class="b-right">
            <li class="b-button">
              <div class="button-content">
                <i class="fa fa-search"></i>
                <router-link to="/search">Search</router-link>
              </div>
            </li>
            <li class="b-button">
              <div class="button-content">
                <i class="fa fa-home"></i>
                <router-link to="/">Home</router-link</li>
              </div>    
            <li class="b-button">
              <div class="button-content">
                <i class="fa fa-bars" aria-hidden="true"></i>
                <router-link to="/project-list">Project</router-link>
              </div>
              
            </li>
            <li class="b-button" v-if="false">
              <div class="button-content">
                <i class="fa fa-laptop" aria-hidden="true"></i>
                <router-link to="/language">Language</router-link>
              </div>

            </li>
            <li class="b-button" v-if="false">
              <div class="button-content">
                <i class="fa fa-link" aria-hidden="true"></i>
                <router-link to="/">Link</router-link>
              </div>

            </li>
            <li class="b-button">
              <div class="button-content">
                <i class="fa fa-heart" aria-hidden="true"></i>
                <router-link to="/">About</router-link>
              </div>

            </li>
            <li class="b-button" v-if="false">
              <div class="button-content">
                <i class="fa fa-github" aria-hidden="true"></i>
                <router-link to="/">GitHub</router-link>
              </div>
            </li>
            <li class="b-button" v-if="!isLogin">
              <div class="button-content">
                <i class="fa fa-sign-in" aria-hidden="true"></i>
                <router-link to="/login">Login</router-link>
              </div>
            </li>
          </ul>
          <div class="userInfo" v-if="isLogin">
            <div class="icon">
              <img :src="admin.avatarUrl" alt="">
              <ul class="menu-ul">
                <li></li>
                <li class="menu-li"  v-if="isAdmin">
                  <i class="fa fa-pencil" aria-hidden="true"></i>
                  Writing
                </li>
                <li @click="addProject" class="menu-li"  v-if="isAdmin">
                  <i class="fa fa-plus" aria-hidden="true"></i> 
                  Add Project
                </li>
                <li class="menu-li"  v-if="isAdmin">
                  <i class="fa fa-cog" aria-hidden="true"></i>
                  Setting
                </li>
                <li class="menu-li" @click="toUserInfo">
                  <i class="fa fa-user" aria-hidden="true"></i>
                  UserInfo
                </li>
                <li class="menu-li" @click="logout">
                  <i class="fa fa-sign-out" aria-hidden="true"></i>
                  Logout
                </li>
              </ul>
            </div>
          </div>
        </div>
    </div>
    <router-view />
  </div>
</template>

<script>

  export default {
    name: "Home",
    data(){
      return{
        admin: "",
        isLogin: false,
        isAdmin: false
      }
    },
    methods: {
      addProject(){
        this.$router.push("/add-project");
      },
      logout(){
        sessionStorage.setItem("user", null);
        this.$router.push("/login");
        // location.reload();
      },
      toUserInfo(){
        this.$router.push("/user-info");
      }
    },
    mounted(){
      let user = sessionStorage.getItem("user");
      if(user != null){
        this.isLogin = true;
        this.admin = JSON.parse(user);
        if(this.admin.power === "ADMIN"){
          this.isAdmin = true;
        }
      }
    }
  };
</script>

<style scoped>

.body {
  height: 60px;
  background-color: #2c3a47;
  /* position: fixed; */
  /* position: absolute; */
  /* top: 50px; */
  width: 100%;
  /* position: relative; */
}

.b-center {
  margin: 0 auto;
  height: 60px;
  width: 95%;
  display: flex;
  justify-content: space-between;
  /* align-items: center; */
  line-height: 60px;
  /* position: fixed; */
  /* position: relative; */
}

.b-center .b-left{
  width: 120px;
}

.b-center .title {
  font-weight: 800;
  font-size: 20px;
  color: #ced6e0;
}

.b-center .b-right {
  list-style: none;
  display: flex;
  /* background-color: aquamarine; */
  width: 90%;
  justify-content: right;
  font-size: 15px;
  /* line-height: 60px; */
  margin-top: 15px;
}

.b-center .b-right .b-button {
  margin-right: 1px;
  /* line-height: 60px; */
}

.b-center .b-right .b-button i {
  padding-right: 5px;
  color: #ced6e0;
}

.b-center .b-right .b-button a {
  text-decoration: none;
  color: #ced6e0;
}

/* 边框动画 */
.b-button {
  width: 105px;
  height: 30px;
  /* background-color: #fff; */
  /* position: absolute; */
  position: relative;
  cursor: pointer;
  text-align: center;
  line-height: 30px;
  /* margin-top: 5px; */
}

.b-button::before {
  content: "";
  width: 0;
  height: 0;
  background: #00adb5;
  position: absolute;
  top: -1px;
  right: -1px;
  z-index: 0;
  transition: width 0.5s, height 0.5s;
}

.b-button::after {
  content: "";
  width: 0;
  height: 0;
  background: #00adb5;
  position: absolute;
  bottom: -1px;
  left: -1px;
  z-index: 0;
  transition: width 0.5s, height 0.5s;
}

.b-button:hover::before {
  width: calc(100% + 2px);
  height: calc(100% + 2px);
}

.b-button:hover::after {
  width: calc(100% + 2px);
  height: calc(100% + 2px);
}

.button-content {
  /* background-color: blue; */
  height: 100%;
  width: 100%;
  position: absolute;
  left: 0;
  top: 0;
  z-index: 1;
  background: #2c3a47;
  /* line-height: 60px; */
  /* margin-top: 5px; */
}

/* ------------------------------ */
/* avatar user info */
.userInfo{
  z-index: 2;
}


.userInfo .icon{
  /* background: turquoise; */
 width: 120px;
 margin-right: -40px;
}


.userInfo .icon img{
  width: 55px;
  cursor: pointer;
  /* height: 55px; */
  margin-top: 3px;
  border-radius: 50%;
  /* padding: auto; */
  margin-left: 33px;
  /* margin: 0 auto; */
  /* z-index: 5; */
}

.userInfo .icon img:hover ~ ul li{
  /* width: 60px; */
  /* height: 70px; */
  /* display: block; */
  height: 40px;

}

.userInfo .icon ul{
  list-style: none;
  /* background: violet; */
  /* top: -20px; */
  margin-top: -63px;

}

.userInfo .icon ul:hover li{
  height: 40px;
}

.userInfo .icon ul li{
  height: 0px;
  width: 120px;
  line-height: 40px;
  padding-left: 18px;
  overflow: hidden;
  transition: 0.5s;
}

.userInfo .icon ul .menu-li{
  background-color: #2c3a47;
  color: #ced6e0;
  cursor: pointer;
  /* z-index: 3; */
}

.userInfo .icon ul li:hover{
  color: #2c3a47;
  background: #ced6e0;

}
</style>