package cn.wk.proxy;

/**
 * Created by wukun on 2019/10/17.
 */
public class GamePlayer implements IGamePlayer {
    private String name;

    public GamePlayer(IGamePlayer player, String name) throws Exception {
        if(player == null){
            throw new Exception("不能创建真实角色");
        }else {
            this.name = name;
        }
    }

    public void login(String username, String password) {
        System.out.println("用户名为:" + username + ",用户密码为：" + password);
    }

    public void killBoss() {
        System.out.println(this.name + "杀boss");
    }

    public void uograde() {
        System.out.println(this.name + "在升级");
    }
}
