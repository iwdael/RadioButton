# RadioButton [![](https://jitpack.io/v/mr-absurd/radiobutton.svg)](https://jitpack.io/#aliletter/radiobutton)
RadioButton 是一个基于官方二次开发的控件，它新增了六个属性，使用起来更加灵活方便，包括控制drawaable的大小，以及drawable与text之间的距离。
# 配置
如何正确地配置到你的项目中:
## 步骤 1. 添加JitPack仓库到你的项目中
合并如下代码项目的根目录的build.gradle文件中:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
## Step 2. 添加依赖
	dependencies {
          compile 'com.github.aliletter:radiobutton:v1.0.3'
          
	}

# 使用说明
```Java
 <com.aliletter.radiobutton.RadioButton
            style="@style/button_style"
            android:drawableLeft="@drawable/radiobutton_drawable"
            android:text="@string/radiobutton_name"
            app:drawable_height="@dimen/radiobutton_drawable_height"
            app:drawable_marginLeft="@dimen/radiobutton_drawable_marginLeft"
            app:drawable_width="@dimen/radiobutton_drawable_width" />
```