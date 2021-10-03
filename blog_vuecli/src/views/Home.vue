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
                <router-link to="">Search</router-link>
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
                <router-link to="">Project</router-link>
              </div>
              
            </li>
            <li class="b-button">
              <div class="button-content">
                <i class="fa fa-cog" aria-hidden="true"></i>
                <router-link to="">Programming</router-link>
              </div>

            </li>
            <li class="b-button">
              <div class="button-content">
                <i class="fa fa-link" aria-hidden="true"></i>
                <router-link to="">Link</router-link>
              </div>

            </li>
            <li class="b-button">
              <div class="button-content">
                <i class="fa fa-heart" aria-hidden="true"></i>
                <router-link to="">About</router-link>
              </div>

            </li>
            <li class="b-button">
              <div class="button-content">
                <i class="fa fa-github" aria-hidden="true"></i>
                <router-link to="">GitHub</router-link>
              </div>

            </li>
          </ul>
        </div>
    </div>
    <router-view />
  </div>
</template>

<script>
  export default {
    name: "Home",
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
}

.b-center {
  margin: 0 auto;
  height: 60px;
  width: 95%;
  display: flex;
  justify-content: space-between;
  align-items: center;
  /* position: fixed; */
  /* position: relative; */
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
}

.b-center .b-right li {
  margin-right: 1px;
}

.b-center .b-right li i {
  padding-right: 5px;
  color: #ced6e0;
}

.b-center .b-right li a {
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
}
</style>