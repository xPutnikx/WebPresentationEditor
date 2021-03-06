// Generated by CoffeeScript 1.3.3
var __hasProp = {}.hasOwnProperty,
  __extends = function(child, parent) { for (var key in parent) { if (__hasProp.call(parent, key)) child[key] = parent[key]; } function ctor() { this.constructor = child; } ctor.prototype = parent.prototype; child.prototype = new ctor(); child.__super__ = parent.prototype; return child; };

define(["./AbstractDrawer"], function(AbstractDrawer) {
  var ShapeModelDrawer;
  return ShapeModelDrawer = (function(_super) {

    __extends(ShapeModelDrawer, _super);

    function ShapeModelDrawer(g2d) {
      this.g2d = g2d;
    }

    ShapeModelDrawer.prototype.paint = function(ShapeModel) {
      return this._ShapeLoaded(ShapeModel.cachedShape, ShapeModel);
    };

    ShapeModelDrawer.prototype._ShapeLoaded = function(Shape, ShapeModel) {
      var bbox;
      bbox = {
        x: ShapeModel.get("x") * this.scale.x,
        y: ShapeModel.get("y") * this.scale.y,
        width: Shape.naturalWidth * this.scale.x,
        height: Shape.naturalHeight * this.scale.y
      };
      this.applyTransforms(ShapeModel, bbox);
      return this.g2d.drawShape(Shape, bbox.x, bbox.y, bbox.width, bbox.height);
    };

    return ShapeModelDrawer;

  })(AbstractDrawer);
});
