package sdai.com.sis.conexiones;

import jakarta.ejb.Singleton;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 * @date 08/05/2025
 * @author Sergio_M
 * @since VERSIONCUSTOMENCURSO
 */
@Singleton
public class MultiPoolDConexiones implements MultiPoolDConexionesLocal {

    @PersistenceContext(unitName = "SDAICFGASG")
    private EntityManager conexionDConfiguracion;

    @Override
    public EntityManager getConexionDConfiguracion() {
        return conexionDConfiguracion;
    }

}
