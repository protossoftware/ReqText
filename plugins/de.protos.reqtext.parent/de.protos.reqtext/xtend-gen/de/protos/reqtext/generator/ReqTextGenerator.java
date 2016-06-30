/**
 * generated by Xtext 2.9.1
 */
package de.protos.reqtext.generator;

import com.google.common.base.Objects;
import de.protos.reqtext.reqText.Image;
import de.protos.reqtext.reqText.RModel;
import de.protos.reqtext.reqText.SpecObject;
import de.protos.reqtext.reqText.State;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class ReqTextGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    CharSequence _generateContents = this.generateContents(resource);
    fsa.generateFile("generatedFile.html", _generateContents);
  }
  
  public CharSequence generateContents(final Resource resource) {
    CharSequence _xblockexpression = null;
    {
      EList<EObject> _contents = resource.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      final EList<SpecObject> specObjs = ((RModel) _head).getObjs();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<html>");
      _builder.newLine();
      _builder.append("<head>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"../doc/style/reqtext.css\">");
      _builder.newLine();
      _builder.append("</head>");
      _builder.newLine();
      _builder.append("<body>");
      _builder.newLine();
      {
        for(final SpecObject specObj : specObjs) {
          _builder.append("\t");
          _builder.append("<h2>");
          String _name = specObj.getName();
          _builder.append(_name, "\t");
          _builder.append("</h2>");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("<p>Description: ");
          String _description = specObj.getDescription();
          _builder.append(_description, "\t");
          _builder.append("</p>");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("<p>State: ");
          State _state = specObj.getState();
          String _name_1 = _state.getName();
          _builder.append(_name_1, "\t");
          _builder.append("</p>");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("<p>Classification: ");
          de.protos.reqtext.reqText.Class _class_ = specObj.getClass_();
          String _name_2 = _class_.getName();
          _builder.append(_name_2, "\t");
          _builder.append("</p>");
          _builder.newLineIfNotEmpty();
          {
            Image _image = specObj.getImage();
            boolean _notEquals = (!Objects.equal(_image, null));
            if (_notEquals) {
              _builder.append("\t");
              _builder.append("<p><img src=\"");
              Image _image_1 = specObj.getImage();
              String _url = _image_1.getUrl();
              _builder.append(_url, "\t");
              _builder.append("\" alt=\"");
              Image _image_2 = specObj.getImage();
              String _name_3 = _image_2.getName();
              _builder.append(_name_3, "\t");
              _builder.append("\"/></p>");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t");
          _builder.newLine();
          {
            EList<SpecObject> _children = specObj.getChildren();
            for(final SpecObject child : _children) {
              _builder.append("\t");
              _builder.append("<h3>");
              String _name_4 = child.getName();
              _builder.append(_name_4, "\t");
              _builder.append("</h3>");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("<p>Description: ");
              String _description_1 = child.getDescription();
              _builder.append(_description_1, "\t");
              _builder.append("</p>");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("<p>State: state: ");
              State _state_1 = child.getState();
              String _name_5 = _state_1.getName();
              _builder.append(_name_5, "\t");
              _builder.append("</p>");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("<p>Classification: classification: ");
              de.protos.reqtext.reqText.Class _class__1 = child.getClass_();
              String _name_6 = _class__1.getName();
              _builder.append(_name_6, "\t");
              _builder.append("</p>");
              _builder.newLineIfNotEmpty();
              {
                Image _image_3 = child.getImage();
                boolean _notEquals_1 = (!Objects.equal(_image_3, null));
                if (_notEquals_1) {
                  _builder.append("\t");
                  _builder.append("<p><img src=\"");
                  Image _image_4 = child.getImage();
                  String _url_1 = _image_4.getUrl();
                  _builder.append(_url_1, "\t");
                  _builder.append("\" alt=\"");
                  Image _image_5 = child.getImage();
                  String _name_7 = _image_5.getName();
                  _builder.append(_name_7, "\t");
                  _builder.append("\"/></p>");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
      _builder.append("</body>");
      _builder.newLine();
      _builder.append("</html>");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}
