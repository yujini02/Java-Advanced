package day07.collection.listEx.sorting.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product implements Comparable<Product>{
    private String product_name;
    private int price;

    @Override
    public int compareTo(Product o) { //Product를 대상으로 비교하면서 정렬하겠다
        //return 값이 양수이면 자리교환, 양수면 뒤쪽것이 더 큰것, 0이거나 음수면 자리교환이 없음
        //제품의 이름순으로 내림차순 < , 오름차순 >
        //return this.product_name.charAt(0) < o.product_name.charAt(0) ? 1: -1;
        //전체문자열 비교
        //return this.product_name.compareTo(o.product_name);
        if(this.product_name.charAt(0) > o.product_name.charAt(0)){
            return 1;
        } else if (this.product_name.charAt(0) == o.product_name.charAt(0)) {
            if(this.price > o.price){
                return 1;
            }else {return  -1;}
        }else {
            return -1;
        }
    }
}
