import java.util.ArrayList;
//这是一个二分查找
public class M {
    public static void main(String[] args) {
    }
}
class Stu {
    private int num;
    private String name;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Se {
    private int key;
    private Student[] List;
    Se (Student[] a, int b) {
        List = a;
        key = b;
    }
    private int s (int low, int high) {
        if (key < Integer.parseInt(List[low].getStuid()) || key > Integer.parseInt(List[high].getStuid()) || low > high) {
            return -1;
        }
        int middle = (low + high) / 2;
        int mNum = Integer.parseInt(List[middle].getStuid());
        return mNum == key ? middle : mNum > key ? s (low, middle - 1) : s (middle + 1 , high);
    }
    public int KeyPosition () {
        return s (0, List.length - 1);
    }
}
