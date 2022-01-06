
package ltd.itema.mall.service;

import ltd.itema.mall.controller.vo.ItemaMallUserVO;
import ltd.itema.mall.entity.MallUser;
import ltd.itema.mall.util.PageQueryUtil;
import ltd.itema.mall.util.PageResult;

import javax.servlet.http.HttpSession;

public interface ItemaMallUserService {
    /**
     * 后台分页
     *
     * @param pageUtil
     * @return
     */
    PageResult getItemaMallUsersPage(PageQueryUtil pageUtil);

    /**
     * 用户注册
     *
     * @param loginName
     * @param password
     * @return
     */
    String register(String loginName, String password);

    /**
     * 商家注册
     *
     * @param shopName
     * @param idCard
     * @param realName
     * @param loginName
     * @return
     */
    String shop_register(String shopName, String idCard,String realName,String loginName);
    /**
     * 登录
     *
     * @param loginName
     * @param passwordMD5
     * @param httpSession
     * @return
     */
    String login(String loginName, String passwordMD5, HttpSession httpSession);

    /**
     * 用户信息修改并返回最新的用户信息
     *
     * @param mallUser
     * @return
     */
    ItemaMallUserVO updateUserInfo(MallUser mallUser, HttpSession httpSession);

    /**
     * 用户禁用与解除禁用(0-未锁定 1-已锁定)
     *
     * @param ids
     * @param lockStatus
     * @return
     */
    Boolean lockUsers(Integer[] ids, int lockStatus);
}
