package cc.moveable_type.piece;

import cc.core.ChineseCharacterWen;
import cc.moveable_type.ChineseCharacterMovableTypeTzu;
import cc.moveable_type.ChineseCharacterMovableTypeWen;
import cc.moveable_type.rectangular_area.RectangularArea;

/**
 * 漢字活字樹狀結構的葉子。把活字的資訊全部集中在同一個物件上（<code>Piece</code>，
 * <code>RectangularArea</code>型態 ），方便函式傳遞與使用，而且物件上也有相對應操縱的函式。
 * 
 * @author Ihc
 * @see ChineseCharacterMovableTypeWen
 */
public class PieceMovableTypeWen extends ChineseCharacterMovableTypeWen
		implements PieceMovableType
{
	/**
	 * 活字物件
	 */
	private RectangularArea rectangularArea;

	/**
	 * 建立字活字結構
	 * 
	 * @param parent
	 *            上一層的活字結構。若上層為樹狀的樹根，傳入null
	 * @param chineseCharacterWen
	 *            文部件結構
	 */
	public PieceMovableTypeWen(ChineseCharacterMovableTypeTzu parent,
			ChineseCharacterWen chineseCharacterWen)
	{
		super(parent, chineseCharacterWen);
		rectangularArea = new RectangularArea();
	}

	@Override
	public RectangularArea getPiece()
	{
		return rectangularArea;
	}

	@Override
	public void setPiece(RectangularArea rectangularArea)
	{
		this.rectangularArea = rectangularArea;
	}
}
