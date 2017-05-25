package basic2.control.mvp;

/**
 * @USER: https://github.com/meikoz/
 * @DATE: 2017/5/17
 */

public interface BaseLogic<V extends BaseView> {
    void bind(V v);

    void unbind();

    boolean isBind();

    V of();
}
