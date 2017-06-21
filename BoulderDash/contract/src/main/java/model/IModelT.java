package model;import java.sql.SQLException;public interface IModelT {
	IHero getHero();		IMap getMap();		String callMapContent(final int id) throws SQLException;
}
