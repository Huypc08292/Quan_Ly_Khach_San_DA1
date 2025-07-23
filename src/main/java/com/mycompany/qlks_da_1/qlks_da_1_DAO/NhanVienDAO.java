package qlks_da_1_DAO;



import QLKS_Utils.XJdbc;
import com.mycompany.qlks_da_1.entity.NhanVien_entity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class NhanVienDAO {

    public void insert(NhanVien_entity entity) {
        String sql = "INSERT INTO NhanVien (MaNV, TenNV, CCCD, SDT, Email, DiaChi, NgaySinh, GioiTinh, ChucVu, Luong, TrangThai) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        XJdbc.executeUpdate(sql,
                entity.getMaNV(),
                entity.getTenNV(),
                entity.getCCCD(),
                entity.getSDT(),
                entity.getEmail(),
                entity.getDiaChi(),
                entity.getNgaySinh(),
                entity.getGioiTinh(),
                entity.getChucVu(),
                entity.getLuong(),
                entity.getTrangThai());
    }

    public void update(NhanVien_entity entity) {
        String sql = "UPDATE NhanVien SET TenNV=?, CCCD=?, SDT=?, Email=?, DiaChi=?, NgaySinh=?, GioiTinh=?, ChucVu=?, Luong=?, TrangThai=? WHERE MaNV=?";
        XJdbc.executeUpdate(sql,
                entity.getTenNV(),
                entity.getCCCD(),
                entity.getSDT(),
                entity.getEmail(),
                entity.getDiaChi(),
                entity.getNgaySinh(),
                entity.getGioiTinh(),
                entity.getChucVu(),
                entity.getLuong(),
                entity.getTrangThai(),
                entity.getMaNV());
    }

    public void delete(String maNV) {
        String sql = "DELETE FROM NhanVien WHERE MaNV=?";
        XJdbc.executeUpdate(sql, maNV);
    }

    public List<NhanVien_entity> selectAll() {
        String sql = "SELECT * FROM NhanVien";
        return selectBySql(sql);
    }

    public NhanVien_entity selectById(String maNV) {
        String sql = "SELECT * FROM NhanVien WHERE MaNV=?";
        List<NhanVien_entity> list = selectBySql(sql, maNV);
        return list.isEmpty() ? null : list.get(0);
    }

    // Phương thức chung để thực thi truy vấn SELECT và ánh xạ kết quả vào List<NhanVien_entity>
    protected List<NhanVien_entity> selectBySql(String sql, Object... args) {
        List<NhanVien_entity> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = XJdbc.executeQuery(sql, args);
            while (rs.next()) {
                NhanVien_entity entity = new NhanVien_entity();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setTenNV(rs.getString("TenNV"));
                entity.setCCCD(rs.getString("CCCD"));
                entity.setSDT(rs.getString("SDT"));
                entity.setEmail(rs.getString("Email"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setNgaySinh(rs.getDate("NgaySinh"));
                entity.setGioiTinh(rs.getString("GioiTinh"));
                entity.setChucVu(rs.getString("ChucVu"));
                entity.setLuong(rs.getDouble("Luong"));
                entity.setTrangThai(rs.getString("TrangThai")); // Hoặc rs.getString("TrangThai") nếu là String
                list.add(entity);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Error executing query: " + sql, ex);
        } finally {
            try {
                if (rs != null && !rs.isClosed()) { // Kiểm tra rs có null và đã đóng chưa
                    rs.getStatement().getConnection().close(); // Đóng kết nối khi không còn cần
                }
            } catch (SQLException ex) {
                ex.printStackTrace(); // Log lỗi đóng kết nối
            }
        }
        return list;
    }
}