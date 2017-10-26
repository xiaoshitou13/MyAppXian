package test.bwie.com.myappxian;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.nostra13.universalimageloader.cache.disc.DiskCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private ImageView mQian;
    private ImageView mHou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {
        mQian = (ImageView) findViewById(R.id.qian);
        mHou = (ImageView) findViewById(R.id.hou);

        getData();
    }



    private void getData() {

         String url = "http://pic18.nipic.com/20111204/7190853_165031251364_2.jpg";


            ImageLoader.getInstance().displayImage(url,mQian);

            String u =  ImageLoader.getInstance().getDiskCache().getDirectory().getPath()+"/667435409.jpg";



            Bitmap bitmap =   BitemUtils.getBitmap(u,50,50);



           mHou.setImageBitmap(bitmap);
    }


}
