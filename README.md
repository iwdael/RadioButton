# RadioButton [![](https://jitpack.io/v/mr-absurd/radiobutton.svg)](https://jitpack.io/#aliletter/radiobutton)
RadioButton is an secondary development control that adds six attributes to make RadioButton more flexible to use, including the size of the drawaable, and the distance between drawable and text.
# How to
To get a Git project into your build:
## Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
## Step 2. Add the dependency

	dependencies {
          compile 'com.github.aliletter:radiobutton:v1.0.3'
          
	}

# Instruction
```Java
 <com.aliletter.radiobutton.RadioButton
            style="@style/button_style"
            android:drawableLeft="@drawable/radiobutton_drawable"
            android:text="@string/radiobutton_name"
            app:drawable_height="@dimen/radiobutton_drawable_height"
            app:drawable_marginLeft="@dimen/radiobutton_drawable_marginLeft"
            app:drawable_width="@dimen/radiobutton_drawable_width" />
```