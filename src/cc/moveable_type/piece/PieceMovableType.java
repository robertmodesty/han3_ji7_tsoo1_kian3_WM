package cc.moveable_type.piece;

import cc.moveable_type.漢字組建活字;
import cc.moveable_type.rectangular_area.活字單元;

/**
 * 物件活字的介面。把活字的資訊全部集中在同一個物件上（<code>Piece</code>，<code>RectangularArea</code>型態
 * ），方便函式傳遞與使用，而且物件上也有相對應操縱的函式。
 * 
 * @author Ihc
 */
public interface PieceMovableType extends 漢字組建活字
{
	/**
	 * 取得物件活字
	 * 
	 * @return 物件活字
	 */
	public 活字單元 getPiece();

	/**
	 * 設定物件活字
	 * 
	 * @param rectangularArea
	 *            物件活字
	 */
//	public void setPiece(RectangularArea rectangularArea);
}
