# RadioButton [![](https://jitpack.io/v/blackchopper/radiobutton.svg)](https://jitpack.io/#blackchopper/radiobutton)
RadioButton is an secondary development control that adds six attributes to make RadioButton more flexible to use, including the size of the drawaable, and the distance between drawable and text.  [中文文档](https://github.com/blackchopper/RadioButton/blob/master/README.md)
## Instruction
### Code Sample
```Java
 <com.blackchopper.radiobutton.RadioButton
            style="@style/button_style"
            android:drawableLeft="@drawable/radiobutton_drawable"
            android:text="@string/radiobutton_name"
            app:drawable_height="@dimen/radiobutton_drawable_height"
            app:drawable_marginLeft="@dimen/radiobutton_drawable_marginLeft"
            app:drawable_width="@dimen/radiobutton_drawable_width" />
```
## How to
To get a Git project into your build:
### Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories.   [click here for details](https://github.com/blackchopper/CarouselBanner/blob/master/root_build.gradle.png)
 ```Java
 	allprojects {
 		repositories {
 			...
 			maven { url 'https://jitpack.io' }
 		}
 	}
 ```
### Step 2. Add the dependency
Add it in your application module build.gradle at the end of dependencies where you want to use.[click here for details](https://github.com/blackchopper/CarouselBanner/blob/master/application_build.gradle.png)
 ```Java
 	dependencies {
                 ...
 	        compile 'com.github.blackchopper:radiobutton:v1.0.5'
 	}
 ```
<br><br><br>
## Thank you for your browsing
If you have any questions, please join the QQ group. I will do my best to answer it for you. Welcome to star and fork this repository, alse follow me.
<br>
![Image Text](https://github.com/blackchopper/CarouselBanner/blob/master/qq_group.png)
 