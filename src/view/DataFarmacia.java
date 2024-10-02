package view;
import model.Medicamento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataFarmacia {
    private List<Medicamento> medicamentos;

    public DataFarmacia() {
        medicamentos = new ArrayList<>();
        agregarMedicamentos();
    }

    private void agregarMedicamentos() {
        medicamentos.add(new Medicamento("Paracetamol", "Tableta", "500mg", "Paracetamol", LocalDate.of(2025, 6, 15), "L001", 15.50, "Dolor y fiebre", "Insuficiencia hepática"));
        medicamentos.add(new Medicamento("Ibuprofeno", "Cápsula", "400mg", "Ibuprofeno", LocalDate.of(2026, 2, 10), "L002", 25.00, "Inflamación y dolor", "Úlceras gástricas"));
        medicamentos.add(new Medicamento("Amoxicilina", "Suspensión", "250mg/5ml", "Amoxicilina", LocalDate.of(2024, 11, 30), "L003", 35.20, "Infecciones bacterianas", "Alergia a penicilina"));
        medicamentos.add(new Medicamento("Metformina", "Tableta", "850mg", "Metformina", LocalDate.of(2025, 8, 25), "L004", 40.00, "Diabetes tipo 2", "Insuficiencia renal"));
        medicamentos.add(new Medicamento("Losartán", "Tableta", "50mg", "Losartán", LocalDate.of(2026, 1, 18), "L005", 18.75, "Hipertensión", "Embarazo"));
        medicamentos.add(new Medicamento("Loratadina", "Jarabe", "5mg/5ml", "Loratadina", LocalDate.of(2024, 12, 20), "L006", 30.00, "Alergias", "Hipersensibilidad"));
        medicamentos.add(new Medicamento("Aspirina", "Tableta", "100mg", "Ácido acetilsalicílico", LocalDate.of(2025, 7, 1), "L007", 12.00, "Dolor leve", "Úlcera péptica"));
        medicamentos.add(new Medicamento("Omeprazol", "Cápsula", "20mg", "Omeprazol", LocalDate.of(2025, 9, 10), "L008", 28.00, "Reflujo gástrico", "Hipersensibilidad a IBP"));
        medicamentos.add(new Medicamento("Simvastatina", "Tableta", "20mg", "Simvastatina", LocalDate.of(2026, 3, 5), "L009", 45.00, "Colesterol alto", "Enfermedad hepática"));
        medicamentos.add(new Medicamento("Diclofenaco", "Tableta", "50mg", "Diclofenaco", LocalDate.of(2025, 10, 12), "L010", 22.50, "Inflamación y dolor", "Úlceras gástricas"));

        medicamentos.add(new Medicamento("Clonazepam", "Tableta", "2mg", "Clonazepam", LocalDate.of(2026, 4, 15), "L011", 60.50, "Trastornos de ansiedad", "Glaucoma"));
        medicamentos.add(new Medicamento("Salbutamol", "Inhalador", "100mcg", "Salbutamol", LocalDate.of(2025, 11, 25), "L012", 35.00, "Asma", "Hipertiroidismo"));
        medicamentos.add(new Medicamento("Azitromicina", "Tableta", "500mg", "Azitromicina", LocalDate.of(2024, 10, 12), "L013", 50.00, "Infecciones bacterianas", "Insuficiencia hepática"));
        medicamentos.add(new Medicamento("Cetirizina", "Tableta", "10mg", "Cetirizina", LocalDate.of(2025, 6, 30), "L014", 20.00, "Alergias", "Insuficiencia renal"));
        medicamentos.add(new Medicamento("Budesonida", "Inhalador", "200mcg", "Budesonida", LocalDate.of(2026, 2, 17), "L015", 70.00, "Asma", "Infecciones respiratorias"));
        medicamentos.add(new Medicamento("Fluconazol", "Cápsula", "150mg", "Fluconazol", LocalDate.of(2025, 5, 10), "L016", 32.00, "Infecciones fúngicas", "Insuficiencia hepática"));
        medicamentos.add(new Medicamento("Tramadol", "Tableta", "50mg", "Tramadol", LocalDate.of(2024, 9, 1), "L017", 45.00, "Dolor severo", "Insuficiencia respiratoria"));
        medicamentos.add(new Medicamento("Levotiroxina", "Tableta", "100mcg", "Levotiroxina", LocalDate.of(2026, 7, 19), "L018", 25.00, "Hipotiroidismo", "Hipertiroidismo"));
        medicamentos.add(new Medicamento("Prednisona", "Tableta", "5mg", "Prednisona", LocalDate.of(2025, 10, 21), "L019", 15.00, "Inflamación", "Infecciones sistémicas"));
        medicamentos.add(new Medicamento("Glibenclamida", "Tableta", "5mg", "Glibenclamida", LocalDate.of(2026, 1, 11), "L020", 12.00, "Diabetes tipo 2", "Cetoacidosis diabética"));

        medicamentos.add(new Medicamento("Aciclovir", "Crema", "5%", "Aciclovir", LocalDate.of(2024, 8, 9), "L021", 55.00, "Infecciones por herpes", "Insuficiencia renal"));
        medicamentos.add(new Medicamento("Enalapril", "Tableta", "10mg", "Enalapril", LocalDate.of(2025, 4, 7), "L022", 18.50, "Hipertensión", "Angioedema"));
        medicamentos.add(new Medicamento("Ranitidina", "Tableta", "150mg", "Ranitidina", LocalDate.of(2026, 6, 25), "L023", 23.00, "Úlceras gástricas", "Hipersensibilidad"));
        medicamentos.add(new Medicamento("Furosemida", "Tableta", "40mg", "Furosemida", LocalDate.of(2025, 12, 1), "L024", 16.50, "Retención de líquidos", "Insuficiencia renal"));
        medicamentos.add(new Medicamento("Atenolol", "Tableta", "50mg", "Atenolol", LocalDate.of(2026, 3, 12), "L025", 21.00, "Hipertensión", "Bradicardia"));
        medicamentos.add(new Medicamento("Naproxeno", "Tableta", "500mg", "Naproxeno", LocalDate.of(2025, 8, 2), "L026", 28.00, "Dolor e inflamación", "Úlcera gástrica"));
        medicamentos.add(new Medicamento("Ciprofloxacino", "Tableta", "500mg", "Ciprofloxacino", LocalDate.of(2026, 5, 8), "L027", 42.50, "Infecciones bacterianas", "Tendinitis"));
        medicamentos.add(new Medicamento("Sertralina", "Tableta", "50mg", "Sertralina", LocalDate.of(2025, 7, 15), "L028", 75.00, "Depresión", "Insuficiencia hepática"));
        medicamentos.add(new Medicamento("Montelukast", "Tableta", "10mg", "Montelukast", LocalDate.of(2026, 8, 9), "L029", 35.00, "Asma", "Hipersensibilidad"));
        medicamentos.add(new Medicamento("Dexametasona", "Tableta", "4mg", "Dexametasona", LocalDate.of(2024, 9, 25), "L030", 22.00, "Inflamación", "Infecciones activas"));

        medicamentos.add(new Medicamento("Lidocaína", "Gel", "5%", "Lidocaína", LocalDate.of(2025, 1, 10), "L031", 27.00, "Dolor local", "Hipersensibilidad"));
        medicamentos.add(new Medicamento("Candesartán", "Tableta", "16mg", "Candesartán", LocalDate.of(2026, 4, 4), "L032", 60.00, "Hipertensión", "Embarazo"));
        medicamentos.add(new Medicamento("Claritromicina", "Tableta", "500mg", "Claritromicina", LocalDate.of(2024, 12, 19), "L033", 58.00, "Infecciones bacterianas", "Insuficiencia hepática"));
        medicamentos.add(new Medicamento("Meloxicam", "Tableta", "15mg", "Meloxicam", LocalDate.of(2025, 5, 20), "L034", 26.50, "Artritis", "Úlceras gástricas"));
        medicamentos.add(new Medicamento("Glucosamina", "Cápsula", "500mg", "Glucosamina", LocalDate.of(2026, 7, 22), "L035", 32.00, "Osteoartritis", "Diabetes"));
        medicamentos.add(new Medicamento("Vildagliptina", "Tableta", "50mg", "Vildagliptina", LocalDate.of(2025, 9, 18), "L036", 80.00, "Diabetes tipo 2", "Insuficiencia hepática"));
        medicamentos.add(new Medicamento("Telmisartán", "Tableta", "40mg", "Telmisartán", LocalDate.of(2026, 2, 14), "L037", 43.00, "Hipertensión", "Embarazo"));
        medicamentos.add(new Medicamento("Duloxetina", "Cápsula", "30mg", "Duloxetina", LocalDate.of(2025, 11, 5), "L038", 95.00, "Trastornos de ansiedad", "Insuficiencia hepática"));
        medicamentos.add(new Medicamento("Metamizol", "Tableta", "500mg", "Metamizol", LocalDate.of(2026, 6, 7), "L039", 15.00, "Dolor e inflamación", "Hipersensibilidad"));
        medicamentos.add(new Medicamento("Topiramato", "Tableta", "100mg", "Topiramato", LocalDate.of(2024, 10, 20), "L040", 70.00, "Epilepsia", "Insuficiencia renal"));

    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }
}
