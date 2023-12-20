package controller;

import java.util.List;

import entity.cart.Cart;
import entity.cart.CartMedia;
import entity.media.Media;

/**
 * This class is the base controller for our AIMS project
 * @author nguyenlm
 */
// Cohesion level: Functional
public class BaseController {
    
    /**
     * The method checks whether the Media in Cart, if it were in, we will return the CartMedia else return null
     * @param media
     * @return CartMedia or null
     * control coupling
     * Phân tích tính Conhesion:
     * - Functional Cohesion: thực hiện một nhiệm vụ cụ thể là kiểm tra xem Media có trong giỏ hàng hay không. 
     * - Informational Cohesion: Trả về CartMedia khi kiểm tra thoả mãn
     */
    public CartMedia checkMediaInCart(Media media){
        return Cart.getCart().checkMediaInCart(media);
    }

    /**
     * This method gets the list of items in cart
     * @return List[CartMedia]
     * Data coupling
     * Phân tích tính Conhesion:
     * - Functional Cohesion: hàm thực hiện chức năng cụ thể
     * - Communicational Cohesion: lấy ra danh sách Media từ Cart
     */
    public List getListCartMedia(){
        return Cart.getCart().getListMedia();
    }
}
