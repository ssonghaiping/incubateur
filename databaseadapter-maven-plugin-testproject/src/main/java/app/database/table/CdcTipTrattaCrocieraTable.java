
package app.database.table;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.text.StrSubstitutor;

/**
 * Represents table {@code CDC_TIP_TRATTA_CROCIERA}.
 *
 * <p>
 * Elenca i tipi di tratte che possono comporre una Crociera
Censimento degli Stati di attraversamento di una determinata tratta del piano di Crociera.
Valori ammissibili:
- Partenza: inizio della Crociera
- Navigazione: la nave e' in navigazione (tra due fasi di Scalo o Partenza/Arrivo)
- Scalo: la Nave a' ferma in porto
- Arrivo: La nave arriva al Porto dove si conclude la Crociera
- Attracco: La nave arriva ad un Porto (termine tratta di Navigazione)
- Transito: la nave transita per uno stretto
 * </p>
 *
 * @author databaseadapter-maven-plugin
 */
@Generated(value="databaseadapter-maven-plugin")
public class CdcTipTrattaCrocieraTable {

	/**
	 * Contains the name of the table.
	 *
	 * <p>
	 * Can be used to format others {@code SQL}.
	 * </p>
	 */		
	public static final String TABLE_NAME = "cdc_tip_tratta_crociera";
		
	/**
	 * Contains a preformatted {@code SELECT COUNT(*) FROM cdc_tip_tratta_crociera}.
	 */		
	public static final String SQL_SELECT_COUNT = "SELECT COUNT(*) FROM " + TABLE_NAME;

	/**
	 * Contains a preformatted {@code SELECT * FROM cdc_tip_tratta_crociera}.
	 */		
	public static final String SQL_SELECT_ALL = "SELECT * FROM " + TABLE_NAME;

	/**
	 * Contains a preformatted {@code DELETE FROM cdc_tip_tratta_crociera}.
	 */		
	public static final String SQL_DELETE = "DELETE FROM " + TABLE_NAME;
	
	/**
	 * Contains all columns found in table {@code CDC_TIP_TRATTA_CROCIERA}.
	 */
	public static enum Column {

		/**
		 * Represents column {@code C_TIP_TRATTA_CROCIERA} of table {@code CDC_TIP_TRATTA_CROCIERA}.
		 *
		 * <p>
		 * Codice del tipo di Stato di attraversamento di una determinata tratta del piano di Crociera.
Valori ammissibili:
  'P' - Partenza (inizio Crociera)
  'N' - Navigazione
  'S' - Scalo
  'D' - Arrivo (fine Crociera)
  'A' - Attracco
  'T' - Transito
		 * </p>
		 */
		c_tip_tratta_crociera,

		/**
		 * Represents column {@code S_TIP_TRATTA_CROCIERA} of table {@code CDC_TIP_TRATTA_CROCIERA}.
		 *
		 * <p>
		 * Descrizione dello stato
		 * </p>
		 */
		s_tip_tratta_crociera,

		/**
		 * Represents column {@code D_MDF} of table {@code CDC_TIP_TRATTA_CROCIERA}.
		 *
		 * <p>
		 * 
		 * </p>
		 */
		d_mdf,

		/**
		 * Represents column {@code N_LOGIN_MDF} of table {@code CDC_TIP_TRATTA_CROCIERA}.
		 *
		 * <p>
		 * 
		 * </p>
		 */
		n_login_mdf,

		/**
		 * Represents column {@code N_LOGIN_IN} of table {@code CDC_TIP_TRATTA_CROCIERA}.
		 *
		 * <p>
		 * 
		 * </p>
		 */
		n_login_in,

		/**
		 * Represents column {@code D_INI} of table {@code CDC_TIP_TRATTA_CROCIERA}.
		 *
		 * <p>
		 * 
		 * </p>
		 */
		d_ini,

		/**
		 * Represents column {@code D_FIN} of table {@code CDC_TIP_TRATTA_CROCIERA}.
		 *
		 * <p>
		 * 
		 * </p>
		 */
		d_fin,

		/**
		 * Represents column {@code V_VER} of table {@code CDC_TIP_TRATTA_CROCIERA}.
		 *
		 * <p>
		 * 
		 * </p>
		 */
		v_ver
	};
	
	/**
	 * Returns a basic &quot;select&quot; {@code SQL} using only specified columns.
	 *
	 * @param columns an array of columns of table {@code CDC_TIP_TRATTA_CROCIERA}
	 * @return basic &quot;select&quot; {@code SQL} using only specified columns
	 */
	public static String newSelect(CdcTipTrattaCrocieraTable.Column[] columns) {
		return new StringBuilder("SELECT ")
			.append(StringUtils.join(namesOf(columns), ", "))
			.append(" FROM ")
			.append(TABLE_NAME)
			.toString();
	}

	/**
	 * Returns an &quot;insert&quot; {@code SQL} using specified columns.
	 *
	 * @param columns an array of columns of table {@code CDC_TIP_TRATTA_CROCIERA}
	 * @return &quot;insert&quot; {@code SQL} using specified columns.
	 */
	public static String newInsert(CdcTipTrattaCrocieraTable.Column[] columns) {
		return new StringBuilder("INSERT INTO ")
			.append(TABLE_NAME)
			.append("(")
			.append(StringUtils.join(namesOf(columns), ", "))
			.append(") VALUES (")
			.append(StringUtils.join(Collections.nCopies(columns.length, "?"), ", "))
			.append(")")
			.toString();
	}

	/**
	 * Returns an &quot;update&quot; {@code SQL} using specified columns in {@code SET} clause.
	 *
	 * @param columns an array of columns of table {@code CDC_TIP_TRATTA_CROCIERA}
	 * @return &quot;update&quot; {@code SQL} using specified columns.
	 */
	public static String newUpdate(CdcTipTrattaCrocieraTable.Column[] columns) {
		return new StringBuilder("UPDATE ")
			.append(TABLE_NAME)
			.append(" SET ")
			.append(StringUtils.join(namesOf(columns, "${name} = ?"), ", "))
			.toString();
	}
	
	/**
	 * Returns the names of specified columns.
	 *
	 * @param columns an array of columns of table {@code CDC_TIP_TRATTA_CROCIERA}
	 * @return names of specified columns
	 */
	public static String[] namesOf(CdcTipTrattaCrocieraTable.Column[] columns) {
		String[] cols = new String[columns.length];
		for (int i = 0; i < columns.length; i++) cols[i] = columns[i].name();
		return cols;
	}

	/**
	 * Returns the names of specified columns applying specified template.
	 * 
	 * <p>
	 * The template has to contain placeholder {@code name} to represent the column name. E.g.
	 * </p>
	 * <pre>
	 *     ${name} = ?
	 * </pre>
	 *
	 * @param columns an array of columns of table {@code CDC_TIP_TRATTA_CROCIERA}
	 * @param template a template ala {@link StrSubstitutor} of {@code commons-lang} library
	 * @return names of specified columns
	 */
	public static String[] namesOf(CdcTipTrattaCrocieraTable.Column[] columns, String template) {
		Map<String, Object> map = new HashMap<String, Object>();
		String[] cols = new String[columns.length];
		for (int i = 0; i < columns.length; i++) {
			map.put("name", columns[i].name());
			cols[i] = StrSubstitutor.replace(template, map);
		}
		return cols;
	}

}