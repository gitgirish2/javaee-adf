package com.dmcsol.xdm.sched.model.view;

import com.dmcsol.xdm.common.framework.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Feb 26 16:53:39 EST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MinMaxDateVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        MinStartDate,
        MaxEndDate;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int MINSTARTDATE = AttributesEnum.MinStartDate.index();
    public static final int MAXENDDATE = AttributesEnum.MaxEndDate.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MinMaxDateVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute MinStartDate.
     * @return the MinStartDate
     */
    public java.util.Date getMinStartDate() {
        return (java.util.Date) getAttributeInternal(MINSTARTDATE);
    }

    /**
     * Gets the attribute value for the calculated attribute MaxEndDate.
     * @return the MaxEndDate
     */
    public java.util.Date getMaxEndDate() {
        return (java.util.Date) getAttributeInternal(MAXENDDATE);
    }
}
