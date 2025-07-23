package qlks_da_1_DAO;




import QLKS_Utils.XJdbc;
import com.mycompany.qlks_da_1.entity.SuDungDV_entity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class SuDungDV_DAO {

    public void insert(SuDungDV_entity entity) {
        String sql = "INSERT INTO SuDungDV (MaSuDung, MaDatPhong, MaDV, SoLuong, NgaySuDung) VALUES (?, ?, ?, ?, ?)";
        XJdbc.executeUpdate(sql,
                entity.getMaSuDung(),
                entity.getMaDatPhong(),
                entity.getMaDV(),
                entity.getSoLuong(),
                entity.getNgaySuDung());
    }

    public void update(SuDungDV_entity entity) {
        String sql = "UPDATE SuDungDV SET MaDatPhong=?, MaDV=?, SoLuong=?, NgaySuDung=? WHERE MaSuDung=?";
        XJdbc.executeUpdate(sql,
                entity.getMaDatPhong(),
                entity.getMaDV(),
                entity.getSoLuong(),
                entity.getNgaySuDung(),
                entity.getMaSuDung());
    }

    public void delete(String maSuDung) {
        String sql = "DELETE FROM SuDungDV WHERE MaSuDung=?";
        XJdbc.executeUpdate(sql, maSuDung);
    }

    public List<SuDungDV_entity> selectAll() {
        String sql = "SELECT * FROM SuDungDV";
        return selectBySql(sql);
    }

    public SuDungDV_entity selectById(String maSuDung) {
        String sql = "SELECT * FROM SuDungDV WHERE MaSuDung=?";
        List<SuDungDV_entity> list = selectBySql(sql, maSuDung);
        return list.isEmpty() ? null : list.get(0);
    }

    protected List<SuDungDV_entity> selectBySql(String sql, Object... args) {
        List<SuDungDV_entity> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = XJdbc.executeQuery(sql, args);
            while (rs.next()) {
                SuDungDV_entity entity = new SuDungDV_entity();
                entity.setMaSuDung(rs.getString("MaSuDung"));
                entity.setMaDatPhong(rs.getString("MaDatPhong"));
                entity.setMaDV(rs.getString("MaDV"));
                entity.setSoLuong(rs.getInt("SoLuong"));
                entity.setNgaySuDung(rs.getDate("NgaySuDung"));
                list.add(entity);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Error executing query: " + sql, ex);
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.getStatement().getConnection().close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return list;
    }
}