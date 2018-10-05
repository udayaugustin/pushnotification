using System;

using Android.App;
using Android.Content.PM;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Android.OS;
using Com.OneSignal;


namespace pushnotification.Droid
{
    [Activity(Label = "pushnotification", Icon = "@drawable/icon", Theme = "@style/MainTheme", MainLauncher = true, ConfigurationChanges = ConfigChanges.ScreenSize | ConfigChanges.Orientation)]
    public class MainActivity : global::Xamarin.Forms.Platform.Android.FormsAppCompatActivity
    {
        protected override void OnCreate(Bundle bundle)
        {
            TabLayoutResource = Resource.Layout.Tabbar;
            ToolbarResource = Resource.Layout.Toolbar;

            OneSignal.Current.StartInit("966bacaa-de6e-46b4-83e4-38a028375e2c")
                .EndInit();

            base.OnCreate(bundle);
            


            global::Xamarin.Forms.Forms.Init(this, bundle);
            LoadApplication(new App());

           
        }
    }
}

