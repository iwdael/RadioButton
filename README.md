# RadioButton [![](https://jitpack.io/v/com.hacknife/radiobutton.svg)](https://jitpack.io/#com.hacknife/radiobutton)
RadioButton 是一个基于官方二次开发的控件，它新增了六个属性，使用起来更加灵活方便，包括控制drawaable的大小，以及drawable与text之间的距离。[English](https://github.com/hacknife/RadioButton/blob/master/README_ENGLISH.md)
## 使用说明
### 代码示例
```Java
 <com.hacknife.radiobutton.RadioButton
            style="@style/button_style"
            android:drawableLeft="@drawable/radiobutton_drawable"
            android:text="@string/radiobutton_name"
            app:drawable_height="@dimen/radiobutton_drawable_height"
            app:drawable_marginLeft="@dimen/radiobutton_drawable_marginLeft"
            app:drawable_width="@dimen/radiobutton_drawable_width" />
```
## 如何配置
将本仓库引入你的项目:
### Step 1. 添加JitPack仓库到Build文件
合并以下代码到项目根目录下的build.gradle文件的repositories尾。[点击查看详情](https://github.com/hacknife/CarouselBanner/blob/master/root_build.gradle.png)
```Java
	allprojects {
		repositories {
			...
			maven { url 'https://hacknife.com' }
		}
	}
```
### Step 2. 添加依赖   
合并以下代码到需要使用的application Module的dependencies尾。[点击查看详情](https://github.com/hacknife/CarouselBanner/blob/master/application_build.gradle.png)
```Java
	dependencies {
                ...
	        compile 'com.hacknife:radiobutton:1.0.7'
	}
```
<br><br><br>
## 感谢浏览
如果你有任何疑问，请加入QQ群，我将竭诚为你解答。欢迎Star和Fork本仓库，当然也欢迎你关注我。
<br>
![Image Text](https://github.com/hacknife/CarouselBanner/blob/master/qq_group.png)
