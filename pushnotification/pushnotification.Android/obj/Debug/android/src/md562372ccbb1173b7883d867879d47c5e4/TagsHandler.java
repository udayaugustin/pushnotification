package md562372ccbb1173b7883d867879d47c5e4;


public class TagsHandler
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.onesignal.OneSignal.GetTagsHandler
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_tagsAvailable:(Lorg/json/JSONObject;)V:GetTagsAvailable_Lorg_json_JSONObject_Handler:Com.OneSignal.Android.OneSignal/IGetTagsHandlerInvoker, OneSignal.Android.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.OneSignal.TagsHandler, Com.OneSignal, Version=3.2.0.0, Culture=neutral, PublicKeyToken=null", TagsHandler.class, __md_methods);
	}


	public TagsHandler () throws java.lang.Throwable
	{
		super ();
		if (getClass () == TagsHandler.class)
			mono.android.TypeManager.Activate ("Com.OneSignal.TagsHandler, Com.OneSignal, Version=3.2.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void tagsAvailable (org.json.JSONObject p0)
	{
		n_tagsAvailable (p0);
	}

	private native void n_tagsAvailable (org.json.JSONObject p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}