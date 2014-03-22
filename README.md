Android Custom Toast Messages
===========

**Showing a standart toast message.**

    public void showStandartToastMessage(View sender)
    {
    	Toast.makeText(this, "Bu standart bir toast mesajıdır.", Toast.LENGTH_SHORT).show();
    }
    

**Showing a success toast message.**

    public void showSuccessToastMessage(View sender)
    {
      ToastHelper.showSuccessToast(this, "Bu başarılı bir toast mesajıdır");
    }

**Showing a fail toast message.**

    public void showFailToastMessage(View sender)
    {
    	ToastHelper.showFailToast(this, "Bu başarısız bir toast mesajıdır.");
    }
    


Demo 
===========
![ScreenShot](/test/demos.gif)
