package cn.wk.proxy;

/**
 * Created by wukun on 2019/10/17.
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer player = null;

    public GamePlayerProxy(String name){
        try {
            this.player = new GamePlayer(this, name);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void login(String username, String password) {
        this.player.login(username, password);
    }

    public void killBoss() {
        this.player.killBoss();
    }

    public void uograde() {
        this.player.uograde();
    }
}
