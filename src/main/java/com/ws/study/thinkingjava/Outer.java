package com.ws.study.thinkingjava;

/**
 * Created by think on 2016/9/7.
 */
public class Outer {
    public String getOuterName() {
        return outerName;
    }

    public void setOuterName(String outerName) {
        this.outerName = outerName;
    }

    private String outerName;

    public Inner getInner(){
        return new Inner("内部类");
    }

    class Inner{
        public String getName() {
            return name+outerName;
        }

        public void setName(String name) {
            this.name = name;
        }

        private String name;
        public Inner(String name_){
            this.name = name_;
        }
    }

    public static void main(String args[]){
        Outer outer = new Outer();
        outer.setOuterName("外部类");
        Inner inner = outer.getInner();
        System.out.println(inner.getName());
    }
}
