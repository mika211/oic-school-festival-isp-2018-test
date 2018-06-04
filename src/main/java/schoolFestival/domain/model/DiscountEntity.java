package schoolFestival.domain.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 値引き モデルクラス
 */
@Entity
@Table(name="DISCOUNT")
public class DiscountEntity implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 値引きID. */
	@Id
	private Integer discountId;

	/** 値引き額. */
	private Integer discount;

	/** 値引き対象商品 一覧. */
	private Set<ProductDiscountEntity> productDiscountSet;

	/**
	 * コンストラクタ.
	 */
	public DiscountEntity() {
		this.productDiscountSet = new HashSet<ProductDiscountEntity>();
	}

	/**
	 * 値引きID を設定します.
	 * 
	 * @param discountId
	 *            値引きID
	 */
	public void setDiscountId(Integer discountId) {
		this.discountId = discountId;
	}

	/**
	 * 値引きID を取得します.
	 * 
	 * @return 値引きID
	 */
	public Integer getDiscountId() {
		return this.discountId;
	}

	/**
	 * 値引き額 を設定します.
	 * 
	 * @param discount
	 *            値引き額
	 */
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	/**
	 * 値引き額 を取得します.
	 * 
	 * @return 値引き額
	 */
	public Integer getDiscount() {
		return this.discount;
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
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((discountId == null) ? 0 : discountId.hashCode());
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
		DiscountEntity other = (DiscountEntity) obj;
		if (discountId == null) {
			if (other.discountId != null) {
				return false;
			}
		} else if (!discountId.equals(other.discountId)) {
			return false;
		}
		return true;
	}

}
