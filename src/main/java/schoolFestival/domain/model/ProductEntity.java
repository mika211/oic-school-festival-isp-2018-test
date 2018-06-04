package schoolFestival.domain.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 商品 モデルクラス.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Entity
@Table(name="PRODUCT")
public class ProductEntity implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 商品ID. */
	@Id
	private Integer productId;

	/** 商品名. */
	private String productName;

	/** 値引き対象商品 一覧. */
	private Set<ProductDiscountEntity> productDiscountSet;

	/** 商品価格 一覧. */
	private Set<ProductPriceEntity> productPriceSet;

	/**
	 * コンストラクタ.
	 */
	public ProductEntity() {
		this.productDiscountSet = new HashSet<ProductDiscountEntity>();
		this.productPriceSet = new HashSet<ProductPriceEntity>();
	}

	/**
	 * 商品ID を設定します.
	 * 
	 * @param productId
	 *            商品ID
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	/**
	 * 商品ID を取得します.
	 * 
	 * @return 商品ID
	 */
	public Integer getProductId() {
		return this.productId;
	}

	/**
	 * 商品名 を設定します.
	 * 
	 * @param productName
	 *            商品名
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * 商品名 を取得します.
	 * 
	 * @return 商品名
	 */
	public String getProductName() {
		return this.productName;
	}

	/**
	 * 値引き対象商品 一覧を設定します.
	 * 
	 * @param productDiscountSet
	 *            値引き対象商品 一覧
	 */
	public void setProductDiscountSet(Set<ProductDiscountEntity> productDiscountSet) {
		this.productDiscountSet = productDiscountSet;
	}

	/**
	 * 値引き対象商品 を追加します.
	 * 
	 * @param productDiscount
	 *            値引き対象商品
	 */
	public void addProductDiscount(ProductDiscountEntity productDiscount) {
		this.productDiscountSet.add(productDiscount);
	}

	/**
	 * 値引き対象商品 一覧を取得します.
	 * 
	 * @return 値引き対象商品 一覧
	 */
	public Set<ProductDiscountEntity> getProductDiscountSet() {
		return this.productDiscountSet;
	}

	/**
	 * 商品価格 一覧を設定します.
	 * 
	 * @param productPriceSet
	 *            商品価格 一覧
	 */
	public void setProductPriceSet(Set<ProductPriceEntity> productPriceSet) {
		this.productPriceSet = productPriceSet;
	}

	/**
	 * 商品価格 を追加します.
	 * 
	 * @param productPrice
	 *            商品価格
	 */
	public void addProductPrice(ProductPriceEntity productPrice) {
		this.productPriceSet.add(productPrice);
	}

	/**
	 * 商品価格 一覧を取得します.
	 * 
	 * @return 商品価格 一覧
	 */
	public Set<ProductPriceEntity> getProductPriceSet() {
		return this.productPriceSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ProductEntity other = (ProductEntity) obj;
		if (productId == null) {
			if (other.productId != null) {
				return false;
			}
		} else if (!productId.equals(other.productId)) {
			return false;
		}
		return true;
	}

}
