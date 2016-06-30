/**
 * generated by Xtext 2.9.2
 */
package de.protos.reqtext.formatting2;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import de.protos.reqtext.reqText.RImport;
import de.protos.reqtext.reqText.RModel;
import de.protos.reqtext.services.ReqTextGrammarAccess;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegionsFinder;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ReqTextFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private ReqTextGrammarAccess _reqTextGrammarAccess;
  
  private final Procedure1<? super IHiddenRegionFormatter> appendDefault = ((Procedure1<IHiddenRegionFormatter>) (IHiddenRegionFormatter it) -> {
    it.setNewLines(1, 1, 2);
  });
  
  protected void _format(final RModel model, @Extension final IFormattableDocument document) {
    ISemanticRegionsFinder _allRegionsFor = this.textRegionExtensions.allRegionsFor(model);
    List<ISemanticRegion> _keywords = _allRegionsFor.keywords(",");
    final Consumer<ISemanticRegion> _function = (ISemanticRegion it) -> {
      final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it_1) -> {
        it_1.noSpace();
      };
      ISemanticRegion _prepend = document.prepend(it, _function_1);
      final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it_1) -> {
        it_1.oneSpace();
      };
      document.append(_prepend, _function_2);
    };
    _keywords.forEach(_function);
    EList<EObject> _eContents = model.eContents();
    final Consumer<EObject> _function_1 = (EObject it) -> {
      boolean _matched = false;
      EList<RImport> _imports = model.getImports();
      RImport _last = IterableExtensions.<RImport>last(_imports);
      if (Objects.equal(it, _last)) {
        _matched=true;
        final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it_1) -> {
          it_1.setNewLines(2, 2, 3);
        };
        document.<EObject>append(it, _function_2);
      }
      if (!_matched) {
        document.<EObject>append(it, this.appendDefault);
      }
    };
    _eContents.forEach(_function_1);
    EList<EObject> _eContents_1 = model.eContents();
    final Consumer<EObject> _function_2 = (EObject it) -> {
      this.format(it, document);
    };
    _eContents_1.forEach(_function_2);
  }
  
  public void format(final Object model, final IFormattableDocument document) {
    if (model instanceof XtextResource) {
      _format((XtextResource)model, document);
      return;
    } else if (model instanceof RModel) {
      _format((RModel)model, document);
      return;
    } else if (model instanceof EObject) {
      _format((EObject)model, document);
      return;
    } else if (model == null) {
      _format((Void)null, document);
      return;
    } else if (model != null) {
      _format(model, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(model, document).toString());
    }
  }
}
