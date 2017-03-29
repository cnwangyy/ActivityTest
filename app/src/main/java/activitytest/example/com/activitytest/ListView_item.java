package activitytest.example.com.activitytest;

/**
 * Created by WangYong on 2017-3-29.
 */

public class ListView_item {
    private String name;
    private int imageId;
    public ListView_item (String name, int imageId){
        this.name = name;
        this.imageId = imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return  imageId;
    }
}
