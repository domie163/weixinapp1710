(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/lingzhengxinxi/add-or-update"],{"059b":function(n,e,r){"use strict";var i=r("fe22"),t=r.n(i);t.a},2261:function(n,e,r){"use strict";(function(n){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0;var i=t(r("a34a"));function t(n){return n&&n.__esModule?n:{default:n}}function a(n,e,r,i,t,a,o){try{var u=n[a](o),c=u.value}catch(s){return void r(s)}u.done?e(c):Promise.resolve(c).then(i,t)}function o(n){return function(){var e=this,r=arguments;return new Promise((function(i,t){var o=n.apply(e,r);function u(n){a(o,i,t,u,c,"next",n)}function c(n){a(o,i,t,u,c,"throw",n)}u(void 0)}))}}var u=function(){Promise.all([r.e("common/vendor"),r.e("components/w-picker/w-picker")]).then(function(){return resolve(r("8b4b"))}.bind(null,r)).catch(r.oe)},c={data:function(){return{ruleForm:{yonghuzhanghao:"",zhenshixingming:"",shenbaoshijian:"",lingzhengshijian:"",lingzhengdidian:"",shuoming:"",gonghao:"",jingchaxingming:"",userid:""},user:{},ro:{yonghuzhanghao:!1,zhenshixingming:!1,shenbaoshijian:!1,lingzhengshijian:!1,lingzhengdidian:!1,shuoming:!1,gonghao:!1,jingchaxingming:!1,userid:!1}}},components:{wPicker:u},computed:{},onLoad:function(e){var r=this;return o(i.default.mark((function t(){var a,o,u,c;return i.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return a=n.getStorageSync("nowTable"),t.next=3,r.$api.session(a);case 3:if(o=t.sent,r.user=o.data,r.ruleForm.gonghao=r.user.gonghao,r.ruleForm.jingchaxingming=r.user.jingchaxingming,r.ruleForm.userid=n.getStorageSync("userid"),e.refid&&(r.ruleForm.refid=e.refid,r.ruleForm.nickname=n.getStorageSync("nickname")),!e.id){t.next=15;break}return r.ruleForm.id=e.id,t.next=13,r.$api.info("lingzhengxinxi",r.ruleForm.id);case 13:o=t.sent,r.ruleForm=o.data;case 15:if(!e.cross){t.next=58;break}u=n.getStorageSync("crossObj"),t.t0=i.default.keys(u);case 18:if((t.t1=t.t0()).done){t.next=58;break}if(c=t.t1.value,"yonghuzhanghao"!=c){t.next=24;break}return r.ruleForm.yonghuzhanghao=u[c],r.ro.yonghuzhanghao=!0,t.abrupt("continue",18);case 24:if("zhenshixingming"!=c){t.next=28;break}return r.ruleForm.zhenshixingming=u[c],r.ro.zhenshixingming=!0,t.abrupt("continue",18);case 28:if("shenbaoshijian"!=c){t.next=32;break}return r.ruleForm.shenbaoshijian=u[c],r.ro.shenbaoshijian=!0,t.abrupt("continue",18);case 32:if("lingzhengshijian"!=c){t.next=36;break}return r.ruleForm.lingzhengshijian=u[c],r.ro.lingzhengshijian=!0,t.abrupt("continue",18);case 36:if("lingzhengdidian"!=c){t.next=40;break}return r.ruleForm.lingzhengdidian=u[c],r.ro.lingzhengdidian=!0,t.abrupt("continue",18);case 40:if("shuoming"!=c){t.next=44;break}return r.ruleForm.shuoming=u[c],r.ro.shuoming=!0,t.abrupt("continue",18);case 44:if("gonghao"!=c){t.next=48;break}return r.ruleForm.gonghao=u[c],r.ro.gonghao=!0,t.abrupt("continue",18);case 48:if("jingchaxingming"!=c){t.next=52;break}return r.ruleForm.jingchaxingming=u[c],r.ro.jingchaxingming=!0,t.abrupt("continue",18);case 52:if("userid"!=c){t.next=56;break}return r.ruleForm.userid=u[c],r.ro.userid=!0,t.abrupt("continue",18);case 56:t.next=18;break;case 58:r.styleChange();case 59:case"end":return t.stop()}}),t)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},lingzhengshijianConfirm:function(n){console.log(n),this.ruleForm.lingzhengshijian=n.result,this.$forceUpdate()},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var n=this;return o(i.default.mark((function e(){return i.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(n.ruleForm.userid){e.next=3;break}return n.$utils.msg("用户id不能为空"),e.abrupt("return");case 3:if(!n.ruleForm.id){e.next=8;break}return e.next=6,n.$api.update("lingzhengxinxi",n.ruleForm);case 6:e.next=10;break;case 8:return e.next=10,n.$api.add("lingzhengxinxi",n.ruleForm);case 10:n.$utils.msgBack("提交成功");case 11:case"end":return e.stop()}}),e)})))()},optionsChange:function(n){this.index=n.target.value},bindDateChange:function(n){this.date=n.target.value},getDate:function(n){var e=new Date,r=e.getFullYear(),i=e.getMonth()+1,t=e.getDate();return"start"===n?r-=60:"end"===n&&(r+=2),i=i>9?i:"0"+i,t=t>9?t:"0"+t,"".concat(r,"-").concat(i,"-").concat(t)},toggleTab:function(n){this.$refs[n].show()}}};e.default=c}).call(this,r("543d")["default"])},"3b6c":function(n,e,r){"use strict";(function(n){r("5174");i(r("66fd"));var e=i(r("f8ab"));function i(n){return n&&n.__esModule?n:{default:n}}n(e.default)}).call(this,r("543d")["createPage"])},"7c4d":function(n,e,r){"use strict";r.r(e);var i=r("2261"),t=r.n(i);for(var a in i)"default"!==a&&function(n){r.d(e,n,(function(){return i[n]}))}(a);e["default"]=t.a},9094:function(n,e,r){"use strict";r.d(e,"b",(function(){return t})),r.d(e,"c",(function(){return a})),r.d(e,"a",(function(){return i}));var i={wPicker:function(){return Promise.all([r.e("common/vendor"),r.e("components/w-picker/w-picker")]).then(r.bind(null,"8b4b"))}},t=function(){var n=this,e=n.$createElement;n._self._c},a=[]},f8ab:function(n,e,r){"use strict";r.r(e);var i=r("9094"),t=r("7c4d");for(var a in t)"default"!==a&&function(n){r.d(e,n,(function(){return t[n]}))}(a);r("059b");var o,u=r("f0c5"),c=Object(u["a"])(t["default"],i["b"],i["c"],!1,null,"2bc483ce",null,!1,i["a"],o);e["default"]=c.exports},fe22:function(n,e,r){}},[["3b6c","common/runtime","common/vendor"]]]);