(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/discussgonggaolan/add-or-update"],{"2d47":function(e,n,t){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var r=a(t("a34a"));function a(e){return e&&e.__esModule?e:{default:e}}function u(e,n,t,r,a,u,o){try{var i=e[u](o),c=i.value}catch(s){return void t(s)}i.done?n(c):Promise.resolve(c).then(r,a)}function o(e){return function(){var n=this,t=arguments;return new Promise((function(r,a){var o=e.apply(n,t);function i(e){u(o,r,a,i,c,"next",e)}function c(e){u(o,r,a,i,c,"throw",e)}i(void 0)}))}}var i=function(){Promise.all([t.e("common/vendor"),t.e("components/w-picker/w-picker")]).then(function(){return resolve(t("8b4b"))}.bind(null,t)).catch(t.oe)},c={data:function(){return{ruleForm:{refid:"",userid:"",nickname:"",content:"",reply:""},user:{},ro:{refid:!1,userid:!1,nickname:!1,content:!1,reply:!1}}},components:{wPicker:i},computed:{},onLoad:function(n){var t=this;return o(r.default.mark((function a(){var u,o,i,c;return r.default.wrap((function(a){while(1)switch(a.prev=a.next){case 0:return u=e.getStorageSync("nowTable"),a.next=3,t.$api.session(u);case 3:if(o=a.sent,t.user=o.data,t.ruleForm.userid=e.getStorageSync("userid"),n.refid&&(t.ruleForm.refid=n.refid,t.ruleForm.nickname=e.getStorageSync("nickname")),!n.id){a.next=13;break}return t.ruleForm.id=n.id,a.next=11,t.$api.info("discussgonggaolan",t.ruleForm.id);case 11:o=a.sent,t.ruleForm=o.data;case 13:if(!n.cross){a.next=40;break}i=e.getStorageSync("crossObj"),a.t0=r.default.keys(i);case 16:if((a.t1=a.t0()).done){a.next=40;break}if(c=a.t1.value,"refid"!=c){a.next=22;break}return t.ruleForm.refid=i[c],t.ro.refid=!0,a.abrupt("continue",16);case 22:if("userid"!=c){a.next=26;break}return t.ruleForm.userid=i[c],t.ro.userid=!0,a.abrupt("continue",16);case 26:if("nickname"!=c){a.next=30;break}return t.ruleForm.nickname=i[c],t.ro.nickname=!0,a.abrupt("continue",16);case 30:if("content"!=c){a.next=34;break}return t.ruleForm.content=i[c],t.ro.content=!0,a.abrupt("continue",16);case 34:if("reply"!=c){a.next=38;break}return t.ruleForm.reply=i[c],t.ro.reply=!0,a.abrupt("continue",16);case 38:a.next=16;break;case 40:t.styleChange();case 41:case"end":return a.stop()}}),a)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=this;return o(r.default.mark((function n(){return r.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:if(e.ruleForm.refid){n.next=3;break}return e.$utils.msg("关联表id不能为空"),n.abrupt("return");case 3:if(e.ruleForm.userid){n.next=6;break}return e.$utils.msg("用户id不能为空"),n.abrupt("return");case 6:if(e.ruleForm.content){n.next=9;break}return e.$utils.msg("评论内容不能为空"),n.abrupt("return");case 9:if(!e.ruleForm.id){n.next=14;break}return n.next=12,e.$api.update("discussgonggaolan",e.ruleForm);case 12:n.next=16;break;case 14:return n.next=16,e.$api.add("discussgonggaolan",e.ruleForm);case 16:e.$utils.msgBack("提交成功");case 17:case"end":return n.stop()}}),n)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,t=n.getFullYear(),r=n.getMonth()+1,a=n.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),r=r>9?r:"0"+r,a=a>9?a:"0"+a,"".concat(t,"-").concat(r,"-").concat(a)},toggleTab:function(e){this.$refs[e].show()}}};n.default=c}).call(this,t("543d")["default"])},"460f":function(e,n,t){"use strict";var r=t("72d3"),a=t.n(r);a.a},"72d3":function(e,n,t){},"8fe3":function(e,n,t){"use strict";t.r(n);var r=t("f95f"),a=t("b328");for(var u in a)"default"!==u&&function(e){t.d(n,e,(function(){return a[e]}))}(u);t("460f");var o,i=t("f0c5"),c=Object(i["a"])(a["default"],r["b"],r["c"],!1,null,"350aa348",null,!1,r["a"],o);n["default"]=c.exports},b328:function(e,n,t){"use strict";t.r(n);var r=t("2d47"),a=t.n(r);for(var u in r)"default"!==u&&function(e){t.d(n,e,(function(){return r[e]}))}(u);n["default"]=a.a},f95f:function(e,n,t){"use strict";var r;t.d(n,"b",(function(){return a})),t.d(n,"c",(function(){return u})),t.d(n,"a",(function(){return r}));var a=function(){var e=this,n=e.$createElement;e._self._c},u=[]},ff1a:function(e,n,t){"use strict";(function(e){t("5174");r(t("66fd"));var n=r(t("8fe3"));function r(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,t("543d")["createPage"])}},[["ff1a","common/runtime","common/vendor"]]]);