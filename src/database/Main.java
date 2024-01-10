package database;

import Models.Enseignant;
import Models.Departement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/systemeducatif";
        String user = "root";
        String pwd = "";
        try (Connection con = DriverManager.getConnection(url, user, pwd)) {
            System.out.println("Meilleure connexion");
            List<Enseignant> enseignants;
            createTable(con);

            Enseignant enseignantAjoute = new Enseignant();
            enseignantAjoute.setNom("Samia");
            enseignantAjoute.setPrenom("El Maliki");
            enseignantAjoute.setEmail("Samia123@gmail.com");
            enseignantAjoute.setGrade("professeur-vacataire");


            Departement departement = new Departement("MATHEMATIQUE");
            enseignantAjoute.setDepartement(departement);

            Enseignant enseignantAmodifier = new Enseignant();
            enseignantAmodifier.setId(3);
            enseignantAmodifier.setNom("Hanae");
            enseignantAmodifier.setPrenom("alami");
            enseignantAmodifier.setEmail("hanaealami123@gmail.com");
            enseignantAmodifier.setGrade("prof-assistante");
            Departement newdept = new Departement("Physique");

            enseignantAmodifier.setDepartement(newdept);
            modifierEnseignant(enseignantAmodifier, con);


            ajouterEnseignant(enseignantAjoute, con);


            Scanner sc = new Scanner(System.in);
            Enseignant enseignant = new Enseignant();


            ajouterEnseignant(enseignant, con);
            modifierEnseignant(enseignant, con);
            supprimerEnseignant(1, con);
            enseignants = afficherTousEnseignants(con);


        } catch (SQLException e) {
            System.out.println("Mauvaise connexion");
            e.printStackTrace();
        }
    }

    public static void ajouterEnseignant(Enseignant enseignant, Connection con) throws SQLException {
        String query = "INSERT INTO enseignant (nom, prenom, email, grade, departement) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, enseignant.getNom());
            ps.setString(2, enseignant.getPrenom());
            ps.setString(3, enseignant.getEmail());
            ps.setString(4, enseignant.getGrade());
            ps.setString(5, enseignant.getDepartement().getIntitule());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void modifierEnseignant(Enseignant enseignant, Connection con) throws SQLException {
        String query1 = "UPDATE enseignant SET nom=?, prenom=?, email=?, grade=?, departement=? WHERE id=?";
        try (PreparedStatement ps = con.prepareStatement(query1)) {
            ps.setString(1, enseignant.getNom());
            ps.setString(2, enseignant.getPrenom());
            ps.setString(3, enseignant.getEmail());
            ps.setString(4, enseignant.getGrade());
            ps.setInt(5, enseignant.getDepartement().getId());
            ps.setInt(6, enseignant.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void supprimerEnseignant(int id, Connection con) throws SQLException {
        String query2 = "DELETE FROM enseignant WHERE id=?";
        try (PreparedStatement ps = con.prepareStatement(query2)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Enseignant> afficherTousEnseignants(Connection con) throws SQLException {
        String query3 = "SELECT * FROM enseignant";
        List<Enseignant> enseignants = new ArrayList<>();
        try (Statement st = con.createStatement();
             ResultSet r = st.executeQuery(query3)) {
            while (r.next()) {
                Departement departement = null;
                if (r.getString("departement") != null) {
                    departement = new Departement(r.getString("departement"));
                }
                enseignants.add(new Enseignant(
                        r.getInt("id"),
                        r.getString("nom"),
                        r.getString("prenom"),
                        r.getString("email"),
                        r.getString("grade"),
                        departement
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return enseignants;
    }

    public static void createTable(Connection con) throws SQLException {
        String query4 = "CREATE TABLE IF NOT EXISTS enseignant(\n" +
                " id int primary key AUTO_INCREMENT,\n" +
                " nom varchar(255),\n" +
                " prenom nvarchar(255),\n" +
                " email nvarchar(255),\n" +
                " grade varchar(255),\n" +
                " departement varchar(255)\n" +  // Assurez-vous que le type est approprié
                ")";
        try (Statement st = con.createStatement()) {
            st.execute(query4);
            System.out.println("Table enseignant créée avec succès.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
