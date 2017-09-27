package pers.tnn.test.abstractclass;

public abstract class Animal {

    private String motion; // 运动的方式
    private int legNum; // 腿的条数

   public void setMotion(String motion) {
        this.motion = motion;
    }

    public void setLegNum(int legNum) {
        this.legNum = legNum;
    }

   public void moveMode() {

       if(getLegNum() > 0) {

          System.out.println("腿的条数大于零，动物一般运动方式为走");
       }
       else {

           System.out.println("腿的条数小于等于零，动物一般运动方式为爬");
       }
   }

    // 返回动物腿的条数
    public abstract int  getLegNum();
}
