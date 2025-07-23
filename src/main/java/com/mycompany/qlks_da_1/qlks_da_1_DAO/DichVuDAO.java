/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks_da_1_DAO;

/**
 *
 * @author ASUS
 */



import QLKS_Utils.XJdbc;
import com.mycompany.qlks_da_1.entity.DichVu_entity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DichVuDAO {

    public void insert(DichVu_entity entity) {
        String sql = "INSERT INTO DichVu (MaDV, TenDV, DonGia, MoTa) VALUES (?, ?, ?, ?)";
        XJdbc.executeUpdate(sql,
                entity.getMaDV(),
                entity.getTenDV(),
                entity.getDonGia(),
                entity.getMoTa());
    }

    public void update(DichVu_entity entity) {
        String sql = "UPDATE DichVu SET TenDV=?, DonGia=?, MoTa=? WHERE MaDV=?";
        XJdbc.executeUpdate(sql,
                entity.getTenDV(),
                entity.getDonGia(),
                entity.getMoTa(),
                entity.getMaDV());
    }

    public void delete(String maDV) {
        String sql = "DELETE FROM DichVu WHERE MaDV=?";
        XJdbc.executeUpdate(sql, maDV);
    }

    public List<DichVu_entity> selectAll() {
        String sql = "SELECT * FROM DichVu";
        return selectBySql(sql);
    }

    public DichVu_entity selectById(String maDV) {
        String sql = "SELECT * FROM DichVu WHERE MaDV=?";
        List<DichVu_entity> list = selectBySql(sql, maDV);
        return list.isEmpty() ? null : list.get(0);
    }

    // Phương thức chung để thực thi truy vấn SELECT và ánh xạ kết quả vào List<DichVu_entity>
    protected List<DichVu_entity> selectBySql(String sql, Object... args) {
        List<DichVu_entity> list = new ArrayList<>();
        ResultSet rs = null; // Khởi tạo rs ở đây
        try {
            rs = XJdbc.executeQuery(sql, args); // Thực thi truy vấn
            while (rs.next()) {
                DichVu_entity entity = new DichVu_entity();
                entity.setMaDV(rs.getString("MaDV"));
                entity.setTenDV(rs.getString("TenDV"));
                entity.setDonGia(rs.getDouble("DonGia"));
                entity.setMoTa(rs.getString("MoTa"));
                list.add(entity);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Error executing query: " + sql, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.getStatement().getConnection().close(); // Đóng kết nối khi không còn cần
                }
            } catch (SQLException ex) {
                ex.printStackTrace(); // Log lỗi đóng kết nối
            }
        }
        return list;
    }
}
