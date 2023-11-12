
public class Review01 {

    public static void main(String[] args) {
        int price = 1111; //商品価格
        int tax = tax(price); //商品の消費税
        System.out.println(tax(price));

    }

    //引数として受け取った商品価格から消費税額を計算して返す
    public static int tax(int price) {
        int tax_rate = 10; //消費税率
        /*
         * 消費税＝商品価格*消費税率/(100%)
         * 小数点切り捨て
         */
        int tax = price * tax_rate / 100;
        return tax;
    }
}
