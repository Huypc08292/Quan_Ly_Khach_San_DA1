package qlks_da_1_DAO;




import QLKS_Utils.XJdbc;
import com.mycompany.qlks_da_1.entity.TaiKhoan_entity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class TaiKhoanDAO {

    public void insert(TaiKhoan_entity entity) {
        String sql = "INSERT INTO TaiKhoan (TenDangNhap, MatKhau, VaiTro, MaNV) VALUES (?, ?, ?, ?)";
        XJdbc.executeUpdate(sql,
                entity.getTenDangNhap(),
                entity.getMatKhau(),
                entity.getVaiTro(),
                entity.getMaNV());
    }

    public void update(TaiKhoan_entity entity) {
        String sql = "UPDATE TaiKhoan SET MatKhau=?, VaiTro=?, MaNV=? WHERE TenDangNhap=?";
        XJdbc.executeUpdate(sql,
                entity.getMatKhau(),
                entity.getVaiTro(),
                entity.getMaNV(),
                entity.getTenDangNhap());
    }

    public void delete(String tenDangNhap) {
        String sql = "DELETE FROM TaiKhoan WHERE TenDangNhap=?";
        XJdbc.executeUpdate(sql, tenDangNhap);
    }

    public List<TaiKhoan_entity> selectAll() {
        String sql = "SELECT * FROM TaiKhoan";
        return selectBySql(sql);
    }

    public TaiKhoan_entity selectById(String tenDangNhap) {
        String sql = "SELECT * FROM TaiKhoan WHERE TenDangNhap=?";
        List<TaiKhoan_entity> list = selectBySql(sql, tenDangNhap);
        return list.isEmpty() ? null : list.get(0);
    }

    // Phương thức chung để thực thi truy vấn SELECT và ánh xạ kết quả vào List<TaiKhoan_entity>
    protected List<TaiKhoan_entity> selectBySql(String sql, Object... args) {
        List<TaiKhoan_entity> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = XJdbc.executeQuery(sql, args);
            while (rs.next()) {
                TaiKhoan_entity entity = new TaiKhoan_entity();
                entity.setTenDangNhap(rs.getString("TenDangNhap"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setVaiTro(rs.getString("VaiTro"));
                entity.setMaNV(rs.getString("MaNV"));
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

    // Bạn có thể thêm các phương thức tìm kiếm cụ thể khác, ví dụ: tìm theo vai trò
    public List<TaiKhoan_entity> selectByVaiTro(String vaiTro) {
        String sql = "SELECT * FROM TaiKhoan WHERE VaiTro=?";
        return selectBySql(sql, vaiTro);
    }

    // Hoặc phương thức để kiểm tra đăng nhập
    public TaiKhoan_entity checkLogin(String tenDangNhap, String matKhau) {
        String sql = "SELECT * FROM TaiKhoan WHERE TenDangNhap=? AND MatKhau=?";
        List<TaiKhoan_entity> list = selectBySql(sql, tenDangNhap, matKhau);
        return list.isEmpty() ? null : list.get(0);
    }
}