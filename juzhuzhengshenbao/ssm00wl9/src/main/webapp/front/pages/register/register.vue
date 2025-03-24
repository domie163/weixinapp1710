<template>
	<view class="content">
		<view class="logo" v-if="true">
			<image :style='{"boxShadow":"0 0 16rpx #59f43e","borderColor":"#ccc","borderRadius":"40rpx","borderWidth":"2rpx","width":"160rpx","borderStyle":"solid","url":"http://codegen.caihongy.cn/20201024/ed5e326ca66f403aa3197b5fbb4ec733.jpg","isShow":true,"height":"160rpx"}' src='http://codegen.caihongy.cn/20201024/ed5e326ca66f403aa3197b5fbb4ec733.jpg' mode="aspectFill"></image>
		</view>
		<view v-if="tableName=='qunzhongyonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.yonghuzhanghao" type="text" class="uni-input" name="" placeholder="用户账号" />
		</view>
		<view v-if="tableName=='qunzhongyonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='qunzhongyonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.zhenshixingming" type="text" class="uni-input" name="" placeholder="真实姓名" />
		</view>
		<view v-if="tableName=='qunzhongyonghu'" class="uni-form-item uni-column">
                        <picker @change="qunzhongyonghuxingbieChange" :value="qunzhongyonghuxingbieIndex" :range="qunzhongyonghuxingbieOptions">
                                <view :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='qunzhongyonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.nianling" type="text" class="uni-input" name="" placeholder="年龄" />
		</view>
		<view v-if="tableName=='jingfang'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.gonghao" type="text" class="uni-input" name="" placeholder="工号" />
		</view>
		<view v-if="tableName=='jingfang'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='jingfang'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.jingchaxingming" type="text" class="uni-input" name="" placeholder="警察姓名" />
		</view>
		<view v-if="tableName=='jingfang'" class="uni-form-item uni-column">
                        <picker @change="jingfangxingbieChange" :value="jingfangxingbieIndex" :range="jingfangxingbieOptions">
                                <view :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='jingfang'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.nianling" type="text" class="uni-input" name="" placeholder="年龄" />
		</view>
		<view v-if="tableName=='jingfang'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.lianxidianhua" type="text" class="uni-input" name="" placeholder="联系电话" />
		</view>
		<view>
			<button @tap="register" type="primary" :style='{"borderColor":"#ccc","backgroundColor":"rgba(23, 152, 242, 1)","borderRadius":"20rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"2rpx","fontSize":"32rpx","borderStyle":"solid","height":"88rpx"}'>注册</button>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
                                qunzhongyonghuxingbieOptions: [],
                                qunzhongyonghuxingbieIndex: 0,
                                jingfangxingbieOptions: [],
                                jingfangxingbieIndex: 0,
				ruleForm: {
				},
				tableName:""
			}
		},
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
	    		this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='qunzhongyonghu'){
                        	this.qunzhongyonghuxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.qunzhongyonghuxingbieOptions[0]
			}
                        // 自定义下拉框值
			if(this.tableName=='jingfang'){
                        	this.jingfangxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.jingfangxingbieOptions[0]
			}
			
			this.styleChange()
		},
		methods: {
                        // 下拉变化
                        qunzhongyonghuxingbieChange(e) {
                                this.qunzhongyonghuxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.qunzhongyonghuxingbieOptions[this.qunzhongyonghuxingbieIndex]
                        },
                        // 下拉变化
                        jingfangxingbieChange(e) {
                                this.jingfangxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.jingfangxingbieOptions[this.jingfangxingbieIndex]
                        },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				if((!this.ruleForm.yonghuzhanghao) && `qunzhongyonghu` == this.tableName){
					this.$utils.msg(`用户账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `qunzhongyonghu` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if(`qunzhongyonghu` == this.tableName && this.ruleForm.nianling&&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
					this.$utils.msg(`年龄应输入整数`);
					return
				}
				if((!this.ruleForm.gonghao) && `jingfang` == this.tableName){
					this.$utils.msg(`工号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `jingfang` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if(`jingfang` == this.tableName && this.ruleForm.nianling&&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
					this.$utils.msg(`年龄应输入整数`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
			}
		}
	}
</script>

<style lang="scss" scoped>
	$color-primary: #b49950;

	.content {
		padding: 100upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	.logo {
		text-align: center;

		image {
			height: 200upx;
			width: 200upx;
			margin: 0 0 60upx;
		}
	}

	.uni-form-item {
		margin-bottom: 40upx;
		padding: 0;

		.uni-input {
			font-size: 30upx;
			padding: 7px 0;
		}
	}

	button[type="primary"] {
		background-color: $color-primary;
		border-radius: 0;
		font-size: 34upx;
		margin-top: 60upx;
	}

	.links {
		text-align: center;
		margin-top: 40upx;
		font-size: 26upx;
		color: #999;

		view {
			display: inline-block;
			vertical-align: top;
			margin: 0 10upx;
		}

		.link-highlight {
			color: $color-primary
		}
	}
.picker-select-input {
	line-height: 88rpx;
}

</style>
