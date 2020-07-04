package tf.fresh.model;

//商品菜谱推荐
public class BeanRecRecp {
	private int recipe_id;			//菜谱编号
	private int goods_id;			//商品编号
	private String goods;			//商品名称(没什么用写多了懒得改了)
	private String recipe_detail;	//描述
	public int getRecipe_id() {
		return recipe_id;
	}
	public void setRecipe_id(int recipe_id) {
		this.recipe_id = recipe_id;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public String getRecipe_detail() {
		return recipe_detail;
	}
	public void setRecipe_detail(String recipe_detail) {
		this.recipe_detail = recipe_detail;
	}
	
	
}
