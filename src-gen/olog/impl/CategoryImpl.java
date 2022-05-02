/**
 */
package olog.impl;

import java.util.Collection;

import olog.Arrow;
import olog.Category;
import olog.OlogPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link olog.impl.CategoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link olog.impl.CategoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link olog.impl.CategoryImpl#getArrow <em>Arrow</em>}</li>
 *   <li>{@link olog.impl.CategoryImpl#getObject <em>Object</em>}</li>
 *   <li>{@link olog.impl.CategoryImpl#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryImpl extends MinimalEObjectImpl.Container implements Category {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArrow() <em>Arrow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrow()
	 * @generated
	 * @ordered
	 */
	protected EList<Arrow> arrow;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected EList<olog.Object> object;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> category;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OlogPackage.Literals.CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OlogPackage.CATEGORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OlogPackage.CATEGORY__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arrow> getArrow() {
		if (arrow == null) {
			arrow = new EObjectContainmentEList<Arrow>(Arrow.class, this, OlogPackage.CATEGORY__ARROW);
		}
		return arrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<olog.Object> getObject() {
		if (object == null) {
			object = new EObjectContainmentEList<olog.Object>(olog.Object.class, this, OlogPackage.CATEGORY__OBJECT);
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<Category>(Category.class, this, OlogPackage.CATEGORY__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OlogPackage.CATEGORY__ARROW:
			return ((InternalEList<?>) getArrow()).basicRemove(otherEnd, msgs);
		case OlogPackage.CATEGORY__OBJECT:
			return ((InternalEList<?>) getObject()).basicRemove(otherEnd, msgs);
		case OlogPackage.CATEGORY__CATEGORY:
			return ((InternalEList<?>) getCategory()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OlogPackage.CATEGORY__NAME:
			return getName();
		case OlogPackage.CATEGORY__DESCRIPTION:
			return getDescription();
		case OlogPackage.CATEGORY__ARROW:
			return getArrow();
		case OlogPackage.CATEGORY__OBJECT:
			return getObject();
		case OlogPackage.CATEGORY__CATEGORY:
			return getCategory();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case OlogPackage.CATEGORY__NAME:
			setName((String) newValue);
			return;
		case OlogPackage.CATEGORY__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case OlogPackage.CATEGORY__ARROW:
			getArrow().clear();
			getArrow().addAll((Collection<? extends Arrow>) newValue);
			return;
		case OlogPackage.CATEGORY__OBJECT:
			getObject().clear();
			getObject().addAll((Collection<? extends olog.Object>) newValue);
			return;
		case OlogPackage.CATEGORY__CATEGORY:
			getCategory().clear();
			getCategory().addAll((Collection<? extends Category>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case OlogPackage.CATEGORY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case OlogPackage.CATEGORY__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case OlogPackage.CATEGORY__ARROW:
			getArrow().clear();
			return;
		case OlogPackage.CATEGORY__OBJECT:
			getObject().clear();
			return;
		case OlogPackage.CATEGORY__CATEGORY:
			getCategory().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case OlogPackage.CATEGORY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case OlogPackage.CATEGORY__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case OlogPackage.CATEGORY__ARROW:
			return arrow != null && !arrow.isEmpty();
		case OlogPackage.CATEGORY__OBJECT:
			return object != null && !object.isEmpty();
		case OlogPackage.CATEGORY__CATEGORY:
			return category != null && !category.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //CategoryImpl
