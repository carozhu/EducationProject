package edu.httpdemo.entity;

import java.util.List;

/**
 * Created by caro on 2017/2/28.
 */

public class PicListEntity {

    /**
     * status : true
     * total : 1022
     * tngou : [{"count":12527,"fcount":0,"galleryclass":4,"id":1036,"img":"/ext/161223/7083a1fde72448a62e477c5aab0721c8.jpg","rcount":0,"size":11,"time":1482494705000,"title":"大胸美女性感爆乳丰满胸围性感图片"},{"count":58866,"fcount":0,"galleryclass":1,"id":1035,"img":"/ext/161223/395b860c06ccaf5b35cde317ff082c18.jpg","rcount":0,"size":9,"time":1482494660000,"title":"蕾丝透视装美女性感包臀裙极品私房照"},{"count":36665,"fcount":0,"galleryclass":3,"id":1034,"img":"/ext/161223/905b7784c0aeb91870fb40d34defae5d.jpg","rcount":0,"size":11,"time":1482494627000,"title":"风骚迷人性感美女凌凌美腿丝袜诱惑写真"},{"count":22563,"fcount":0,"galleryclass":6,"id":1033,"img":"/ext/161213/c5f1416b4feb857b8d711f83dc692885.jpg","rcount":0,"size":18,"time":1481628679000,"title":"亚洲美女菲儿火辣身材白皙肌肤性感人体艺术"},{"count":27546,"fcount":0,"galleryclass":1,"id":1032,"img":"/ext/161213/a94ead894d0d0e4e5b3b807626eeab4d.jpg","rcount":0,"size":10,"time":1481628573000,"title":"大胸美女御姐酥胸事业线美腿妖娆性感"},{"count":15953,"fcount":0,"galleryclass":5,"id":1031,"img":"/ext/161213/15570de94749040cd46edc90ff4d78fd.jpg","rcount":0,"size":9,"time":1481628520000,"title":"妖娆妩媚的少妇巨乳美腿诱人性感图片"},{"count":14935,"fcount":0,"galleryclass":1,"id":1030,"img":"/ext/161211/93a8c952a96f75389f2e9a0d6846ca6e.jpg","rcount":0,"size":9,"time":1481426601000,"title":"蕾丝美女大胆极品透视装性感私房写真图片"},{"count":12275,"fcount":0,"galleryclass":7,"id":1029,"img":"/ext/161211/46eb25e2af0bb96cf38b26e560574fcd.jpg","rcount":0,"size":9,"time":1481426436000,"title":"丰满大胸巨乳车模事业线诱人性感图片"},{"count":9440,"fcount":0,"galleryclass":4,"id":1028,"img":"/ext/161209/c4c20b7bb0d013512b59a2f4f40cdc97.jpg","rcount":0,"size":10,"time":1481282263000,"title":"长发性感女神菲儿白嫩美腿浴室"},{"count":11432,"fcount":0,"galleryclass":3,"id":1027,"img":"/ext/161209/c7cd24dcc868f2d61589cfafa833a462.jpg","rcount":0,"size":15,"time":1481282202000,"title":"高跟鞋黑丝美腿美女模特私房大胆妖娆性感"},{"count":8761,"fcount":0,"galleryclass":5,"id":1026,"img":"/ext/161209/55bb2e655360005c836bb1aded451aa8.jpg","rcount":0,"size":22,"time":1481282123000,"title":"极品嫩模吊带睡衣床上性感诱惑"},{"count":8755,"fcount":0,"galleryclass":1,"id":1025,"img":"/ext/161209/6cc26c6f440c091e0cf78229a9642929.jpg","rcount":0,"size":10,"time":1481282052000,"title":"性感洋娃娃yurisa闺房爆乳翘臀靓丽"},{"count":8580,"fcount":0,"galleryclass":3,"id":1024,"img":"/ext/161202/df67a2334927e5aac9ba186000a6199e.jpg","rcount":0,"size":7,"time":1480682613000,"title":"黑丝长腿高跟美女俏丽温馨迷人"},{"count":8520,"fcount":0,"galleryclass":3,"id":1023,"img":"/ext/161202/a431e8f761b42aaa2e4769780e8bdae4.jpg","rcount":0,"size":8,"time":1480682567000,"title":"豹纹内衣美女大胆黑丝网袜美腿"},{"count":4520,"fcount":0,"galleryclass":4,"id":1022,"img":"/ext/161202/14ac96e94bf34ee409a0ccc3041ce753.jpg","rcount":0,"size":15,"time":1480682528000,"title":"旗袍美女玲珑曲线曼妙性感古典迷人"},{"count":12167,"fcount":0,"galleryclass":1,"id":1021,"img":"/ext/161202/be4ee41db8e48be69ed47ce34db612ab.jpg","rcount":0,"size":7,"time":1480682472000,"title":"大胸美女酸酱兔裹身裙大尺度爆乳酥胸性感"},{"count":5892,"fcount":0,"galleryclass":1,"id":1020,"img":"/ext/161127/e0f476a787c02338aa21d685808780f4.jpg","rcount":0,"size":9,"time":1480244937000,"title":"性感美少女情趣内衣私房性感迷人写真图片"},{"count":4480,"fcount":0,"galleryclass":1,"id":1019,"img":"/ext/161127/38b16f1831bb3ea6a44759371d070985.jpg","rcount":0,"size":6,"time":1480244882000,"title":"清新玉女陈大榕清纯白衬衫私房大胆人体性感"},{"count":3816,"fcount":0,"galleryclass":1,"id":1018,"img":"/ext/161127/c3f698ff5d050d2402d5333df61d2c43.jpg","rcount":0,"size":16,"time":1480244841000,"title":"大胸美女容容容Alice蕾丝美腿私拍"},{"count":5346,"fcount":0,"galleryclass":1,"id":1017,"img":"/ext/161120/8499e465dce9b1e50890574bb396c4c9.jpg","rcount":0,"size":20,"time":1479642881000,"title":"爆乳酥胸美女方绮言Ayaka性感旅拍"}]
     */

    private boolean status;
    private int total;
    private List<TngouBean> tngou;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<TngouBean> getTngou() {
        return tngou;
    }

    public void setTngou(List<TngouBean> tngou) {
        this.tngou = tngou;
    }

    public static class TngouBean {
        /**
         * count : 12527
         * fcount : 0
         * galleryclass : 4
         * id : 1036
         * img : /ext/161223/7083a1fde72448a62e477c5aab0721c8.jpg
         * rcount : 0
         * size : 11
         * time : 1482494705000
         * title : 大胸美女性感爆乳丰满胸围性感图片
         */

        private int count;
        private int fcount;
        private int galleryclass;
        private int id;
        private String img;
        private int rcount;
        private int size;
        private long time;
        private String title;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getFcount() {
            return fcount;
        }

        public void setFcount(int fcount) {
            this.fcount = fcount;
        }

        public int getGalleryclass() {
            return galleryclass;
        }

        public void setGalleryclass(int galleryclass) {
            this.galleryclass = galleryclass;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public int getRcount() {
            return rcount;
        }

        public void setRcount(int rcount) {
            this.rcount = rcount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public long getTime() {
            return time;
        }

        public void setTime(long time) {
            this.time = time;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}



