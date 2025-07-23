package qlks_da_1_DAO;



import QLKS_Utils.XJdbc;
import com.mycompany.qlks_da_1.entity.DatPhong_entity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DatPhong_DAO {

    public void insert(DatPhong_entity entity) {
        String sql = "INSERT INTO DatPhong (MaDatPhong, MaKH, MaPhong, MaNV, NgayDat, NgayNhan, NgayTra, TinhTrang) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        XJdbc.executeUpdate(sql,
                entity.getMaDatPhong(),
                entity.getMaKH(),
                entity.getMaPhong(),
                entity.getMaNV(),
                entity.getNgayDat(),
                entity.getNgayNhan(),
                entity.getNgayTra(),
                entity.getTinhTrang());
    }

    public void update(DatPhong_entity entity) {
        String sql = "UPDATE DatPhong SET MaKH=?, MaPhong=?, MaNV=?, NgayDat=?, NgayNhan=?, NgayTra=?, TinhTrang=? WHERE MaDatPhong=?";
        XJdbc.executeUpdate(sql,
                entity.getMaKH(),
                entity.getMaPhong(),
                entity.getMaNV(),
                entity.getNgayDat(),
                entity.getNgayNhan(),
                entity.getNgayTra(),
                entity.getTinhTrang(),
                entity.getMaDatPhong());
    }

    public void delete(String maDatPhong) {
        String sql = "DELETE FROM DatPhong WHERE MaDatPhong=?";
        XJdbc.executeUpdate(sql, maDatPhong);
    }

    public List<DatPhong_entity> selectAll() {
        String sql = "SELECT * FROM DatPhong";
        return selectBySql(sql);
    }

    public DatPhong_entity selectById(String maDatPhong) {
        String sql = "SELECT * FROM DatPhong WHERE MaDatPhong=?";
        List<DatPhong_entity> list = selectBySql(sql, maDatPhong);
        return list.isEmpty() ? null : list.get(0);
    }

    protected List<DatPhong_entity> selectBySql(String sql, Object... args) {
        List<DatPhong_entity> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = XJdbc.executeQuery(sql, args);
            while (rs.next()) {
                DatPhong_entity entity = new DatPhong_entity();
                entity.setMaDatPhong(rs.getString("MaDatPhong"));
                entity.setMaKH(rs.getString("MaKH"));
                entity.setMaPhong(rs.getString("MaPhong"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setNgayDat(rs.getDate("NgayDat"));
                entity.setNgayNhan(rs.getDate("NgayNhan"));
                entity.setNgayTra(rs.getDate("NgayTra"));
                entity.setTinhTrang(rs.getString("TinhTrang"));
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