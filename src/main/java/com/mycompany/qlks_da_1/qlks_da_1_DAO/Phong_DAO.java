package qlks_da_1_DAO;




import QLKS_Utils.XJdbc;
import com.mycompany.qlks_da_1.entity.Phong_entity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Phong_DAO {

    public void insert(Phong_entity entity) {
        String sql = "INSERT INTO Phong (MaPhong, TenPhong, LoaiPhong, GiaPhong, TrangThai, MoTa) VALUES (?, ?, ?, ?, ?, ?)";
        XJdbc.executeUpdate(sql,
                entity.getMaPhong(),
                entity.getTenPhong(),
                entity.getLoaiPhong(),
                entity.getGiaPhong(),
                entity.getTrangThai(),
                entity.getMoTa());
    }

    public void update(Phong_entity entity) {
        String sql = "UPDATE Phong SET TenPhong=?, LoaiPhong=?, GiaPhong=?, TrangThai=?, MoTa=? WHERE MaPhong=?";
        XJdbc.executeUpdate(sql,
                entity.getTenPhong(),
                entity.getLoaiPhong(),
                entity.getGiaPhong(),
                entity.getTrangThai(),
                entity.getMoTa(),
                entity.getMaPhong());
    }

    public void delete(String maPhong) {
        String sql = "DELETE FROM Phong WHERE MaPhong=?";
        XJdbc.executeUpdate(sql, maPhong);
    }

    public List<Phong_entity> selectAll() {
        String sql = "SELECT * FROM Phong";
        return selectBySql(sql);
    }

    public Phong_entity selectById(String maPhong) {
        String sql = "SELECT * FROM Phong WHERE MaPhong=?";
        List<Phong_entity> list = selectBySql(sql, maPhong);
        return list.isEmpty() ? null : list.get(0);
    }

    protected List<Phong_entity> selectBySql(String sql, Object... args) {
        List<Phong_entity> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = XJdbc.executeQuery(sql, args);
            while (rs.next()) {
                Phong_entity entity = new Phong_entity();
                entity.setMaPhong(rs.getString("MaPhong"));
                entity.setTenPhong(rs.getString("TenPhong"));
                entity.setLoaiPhong(rs.getString("LoaiPhong"));
                entity.setGiaPhong(rs.getDouble("GiaPhong"));
                entity.setTrangThai(rs.getString("TrangThai"));
                entity.setMoTa(rs.getString("MoTa"));
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