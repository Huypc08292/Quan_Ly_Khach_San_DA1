package qlks_da_1_DAO;




import QLKS_Utils.XJdbc;
import com.mycompany.qlks_da_1.entity.HoaDon_entity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class HoaDonDAO {

    public void insert(HoaDon_entity entity) {
        String sql = "INSERT INTO HoaDon (MaHoaDon, MaDatPhong, MaNV, NgayTaoHD, TongTien, GhiChu) VALUES (?, ?, ?, ?, ?, ?)";
        XJdbc.executeUpdate(sql,
                entity.getMaHoaDon(),
                entity.getMaDatPhong(),
                entity.getMaNV(),
                entity.getNgayTaoHD(),
                entity.getTongTien(),
                entity.getGhiChu());
    }

    public void update(HoaDon_entity entity) {
        String sql = "UPDATE HoaDon SET MaDatPhong=?, MaNV=?, NgayTaoHD=?, TongTien=?, GhiChu=? WHERE MaHoaDon=?";
        XJdbc.executeUpdate(sql,
                entity.getMaDatPhong(),
                entity.getMaNV(),
                entity.getNgayTaoHD(),
                entity.getTongTien(),
                entity.getGhiChu(),
                entity.getMaHoaDon());
    }

    public void delete(String maHoaDon) {
        String sql = "DELETE FROM HoaDon WHERE MaHoaDon=?";
        XJdbc.executeUpdate(sql, maHoaDon);
    }

    public List<HoaDon_entity> selectAll() {
        String sql = "SELECT * FROM HoaDon";
        return selectBySql(sql);
    }

    public HoaDon_entity selectById(String maHoaDon) {
        String sql = "SELECT * FROM HoaDon WHERE MaHoaDon=?";
        List<HoaDon_entity> list = selectBySql(sql, maHoaDon);
        return list.isEmpty() ? null : list.get(0);
    }

    // Phương thức chung để thực thi truy vấn SELECT và ánh xạ kết quả vào List<HoaDon_entity>
    protected List<HoaDon_entity> selectBySql(String sql, Object... args) {
        List<HoaDon_entity> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = XJdbc.executeQuery(sql, args);
            while (rs.next()) {
                HoaDon_entity entity = new HoaDon_entity();
                entity.setMaHoaDon(rs.getString("MaHoaDon"));
                entity.setMaDatPhong(rs.getString("MaDatPhong"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setNgayTaoHD(rs.getDate("NgayTaoHD"));
                entity.setTongTien(rs.getDouble("TongTien"));
                entity.setGhiChu(rs.getString("GhiChu"));
                list.add(entity);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Error executing query: " + sql, ex);
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.getStatement().getConnection().close(); // Đóng kết nối khi không còn cần
                }
            } catch (SQLException ex) {
                ex.printStackTrace(); // Log lỗi đóng kết nối
            }
        }
        return list;
    }
}