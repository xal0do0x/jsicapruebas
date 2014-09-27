package com.project.jsica.cdi;

import com.project.jsica.ejb.dao.EmpleadoPermisoFacadeLocal;
import com.project.jsica.ejb.entidades.EmpleadoPermiso;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "empleadoPermisoController")
@ViewScoped
public class EmpleadoPermisoController extends AbstractController<EmpleadoPermiso> {
    @EJB
    private EmpleadoPermisoFacadeLocal empleadoPermisoFacade;
    @Inject
    private EmpleadoController empleadoIdController;
    @Inject
    private PermisoController permisoIdController;
    @Inject
    private PapeletaController papeletaListController;

    public EmpleadoPermisoController() {
        // Inform the Abstract parent controller of the concrete EmpleadoPermiso?cap_first Entity
        super(EmpleadoPermiso.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        empleadoIdController.setSelected(null);
        permisoIdController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Empleado controller in order to
     * display its data in a dialog. This is reusing existing the existing View
     * dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareEmpleadoId(ActionEvent event) {
        if (this.getSelected() != null && empleadoIdController.getSelected() == null) {
            empleadoIdController.setSelected(this.getSelected().getEmpleadoId());
        }
    }

    /**
     * Sets the "selected" attribute of the Permiso controller in order to
     * display its data in a dialog. This is reusing existing the existing View
     * dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void preparePermisoId(ActionEvent event) {
        if (this.getSelected() != null && permisoIdController.getSelected() == null) {
            permisoIdController.setSelected(this.getSelected().getPermisoId());
        }
    }

    /**
     * Sets the "items" attribute with a collection of Papeleta entities that
     * are retrieved from EmpleadoPermiso?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Papeleta page
     */
    public String navigatePapeletaList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Papeleta_items", this.getSelected().getPapeletaList());
        }
        return "/papeleta/index";
    }

    @Override
    protected void edit(EmpleadoPermiso objeto) {
        this.empleadoPermisoFacade.edit(objeto);
    }

    @Override
    protected void remove(EmpleadoPermiso objeto) {
        this.empleadoPermisoFacade.remove(objeto);
    }

    @Override
    public EmpleadoPermiso find(Object id) {
        return this.empleadoPermisoFacade.find(id);
    }

    @Override
    public List<EmpleadoPermiso> getItems() {
        return this.empleadoPermisoFacade.findAll();
    }

    @Override
    public List<EmpleadoPermiso> search(String namedQuery) {
        return this.empleadoPermisoFacade.search(namedQuery);
    }

    @Override
    public List<EmpleadoPermiso> search(String namedQuery, Map<String, Object> parametros) {
        return this.empleadoPermisoFacade.search(namedQuery, parametros);
    }

    @Override
    public List<EmpleadoPermiso> search(String namedQuery, Map<String, Object> parametros, int inicio, int tamanio) {
        return this.empleadoPermisoFacade.search(namedQuery, parametros, inicio, tamanio);
    }

}
