
public class Review01 {

    public static void main(String[] args) {
        int price_tax_exclude = 12345; //商品価格(税抜き)
        int tax = tax(price_tax_exclude); //商品の消費税
        int price_tax_include = price_tax_exclude + tax; //商品価格（税込み）
        System.out.println(price_tax_exclude + "円の商品の税込価格は" + price_tax_include +"円（消費税は" + tax + "円）です。");

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
