import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import qunzhongyonghu from '@/views/modules/qunzhongyonghu/list'
    import juzhuzhengdengji from '@/views/modules/juzhuzhengdengji/list'
    import jingfang from '@/views/modules/jingfang/list'
    import huizhidan from '@/views/modules/huizhidan/list'
    import lingzhengxinxi from '@/views/modules/lingzhengxinxi/list'
    import discussgonggaolan from '@/views/modules/discussgonggaolan/list'
    import gonggaolan from '@/views/modules/gonggaolan/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/qunzhongyonghu',
        name: '群众用户',
        component: qunzhongyonghu
      }
          ,{
	path: '/juzhuzhengdengji',
        name: '居住证登记',
        component: juzhuzhengdengji
      }
          ,{
	path: '/jingfang',
        name: '警方',
        component: jingfang
      }
          ,{
	path: '/huizhidan',
        name: '回执单',
        component: huizhidan
      }
          ,{
	path: '/lingzhengxinxi',
        name: '领证信息',
        component: lingzhengxinxi
      }
          ,{
	path: '/discussgonggaolan',
        name: '公告栏评论',
        component: discussgonggaolan
      }
          ,{
	path: '/gonggaolan',
        name: '公告栏',
        component: gonggaolan
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
